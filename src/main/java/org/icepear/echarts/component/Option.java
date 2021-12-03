package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.component.legend.LegendOption;
import org.icepear.echarts.origin.component.title.TitleOption;
import org.icepear.echarts.origin.component.toolbox.ToolboxOption;
import org.icepear.echarts.origin.component.tooltip.TooltipOption;
import org.icepear.echarts.origin.coord.cartesian.AxisOption;
import org.icepear.echarts.origin.coord.cartesian.GridOption;
import org.icepear.echarts.origin.coord.polar.AngleAxisOption;
import org.icepear.echarts.origin.coord.polar.PolarOption;
import org.icepear.echarts.origin.coord.polar.RadiusAxisOption;
import org.icepear.echarts.origin.export.EChartsOption;
import org.icepear.echarts.origin.util.AnimationOption;
import org.icepear.echarts.origin.util.ComponentOption;
import org.icepear.echarts.origin.util.SeriesOption;

import lombok.experimental.Accessors;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Accessors(chain=true)
@Data
public class Option implements EChartsOption {
    private List<Object> dataset;

    private Object aria;

    @Setter(AccessLevel.NONE)
    private Object title;

    public Option setTitle(TitleOption title) {
        this.title = title;
        return this;
    }

    public Option setTitle(List<TitleOption> title) {
        this.title = title;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object grid;

    public Option setGrid(GridOption grid) {
        this.grid = grid;
        return this;
    }

    public Option setGrid(List<GridOption> grid) {
        this.grid = grid;
        return this;
    }

    private List<Object> radar;

    @Setter(AccessLevel.NONE)
    private Object polar;

    public Option setPolar(PolarOption polar) {
        this.polar = polar;
        return this;
    }

    public Option setPolar(List<PolarOption> polar) {
        this.polar = polar;
        return this;
    }

    private List<Object> geo;

    @Setter(AccessLevel.NONE)
    private Object angleAxis;

    public Option setAngleAxis(AngleAxisOption angleAxis) {
        this.angleAxis = angleAxis;
        return this;
    }

    public Option setAngleAxis(List<AngleAxisOption> angleAxis) {
        this.angleAxis = angleAxis;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object radiusAxis;

    public Option setRadiusAxis(RadiusAxisOption radiusAxis) {
        this.radiusAxis = radiusAxis;
        return this;
    }

    public Option setRadiusAxis(List<RadiusAxisOption> radiusAxis) {
        this.radiusAxis = radiusAxis;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object xAxis;

    public Option setXAxis(AxisOption xAxis) {
        this.xAxis = xAxis;
        return this;
    }

    public Option setXAxis(List<AxisOption> xAxis) {
        this.xAxis = xAxis;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object yAxis;

    public Option setYAxis(AxisOption yAxis) {
        this.yAxis = yAxis;
        return this;
    }

    public Option setYAxis(List<AxisOption> yAxis) {
        this.yAxis = yAxis;
        return this;
    }

    private List<Object> singleAxis;

    private List<Object> parallel;

    private List<Object> parallelAxis;

    private List<Object> calendar;

    @Setter(AccessLevel.NONE)
    private Object toolbox;

    public Option setToolbox(ToolboxOption toolbox) {
        this.toolbox = toolbox;
        return this;
    }

    public Option setToolbox(List<ToolboxOption> toolbox) {
        this.toolbox = toolbox;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object tooltip;

    public Option setTooltip(TooltipOption tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public Option setTooltip(List<TooltipOption> tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    private List<Object> axisPointer;

    private List<Object> brush;

    @Setter(AccessLevel.NONE)
    private Object legend;

    public Option setLegend(LegendOption legend) {
        this.legend = legend;
        return this;
    }

    public Option setLegend(List<LegendOption> legend) {
        this.legend = legend;
        return this;
    }

    private List<Object> dataZoom;

    private List<Object> visualMap;

    private List<Object> graphic;

    private List<SeriesOption> series;

    private Object baseOption;

    private Object options;

    private Object media;

    private List<ComponentOption> timeline;

    private String backgroundColor;

    private String darkMode;

    private Object textStyle;

    private Boolean useUTC;

    private AnimationOption stateAnimation;

    private String animation;

    private Number animationThreshold;

    private Number animationDuration;

    private String animationEasing;

    private Number animationDelay;

    private Number animationDurationUpdate;

    private String animationEasingUpdate;

    private Number animationDelayUpdate;

    private List<String> color;

    private List<List<String>> colorLayer;
}
