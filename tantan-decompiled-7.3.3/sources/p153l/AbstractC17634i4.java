package p153l;

import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: renamed from: l.i4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17634i4 extends jt2 implements gam {
    protected FilterOptions mOptions;
    private ssl renderFinishListener;
    private long duration = -1;
    private long startTime = -1;

    public long getDuration() {
        return this.duration;
    }

    public long getEscapedTime() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.startTime;
        long j = this.duration;
        return jCurrentTimeMillis >= j ? j : System.currentTimeMillis() - this.startTime;
    }

    public FilterOptions getFilterOptions() {
        return this.mOptions;
    }

    @Override // p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        ssl sslVar;
        super.newTextureReady(i, gfjVar, z);
        if (this.duration > -1 && this.startTime != -1 && System.currentTimeMillis() - this.startTime > this.duration && (sslVar = this.renderFinishListener) != null) {
            sslVar.onRenderFinish();
        }
        if (this.startTime == -1) {
            this.startTime = System.currentTimeMillis();
        }
    }

    public void resetFilterOptions(FilterOptions filterOptions) {
        setFilterOptions(filterOptions);
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setFilterOptions(FilterOptions filterOptions) {
        this.mOptions = filterOptions;
    }

    public void setRenderFinishListener(ssl sslVar) {
        this.renderFinishListener = sslVar;
    }

    public void setTimeStamp(long j) {
    }
}
