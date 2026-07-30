package p003l;

import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: renamed from: l.i4 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class AbstractC0341i4 extends ts2 implements q7m {
    protected FilterOptions mOptions;
    private gql renderFinishListener;
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

    @Override // p003l.ts2, p003l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        gql gqlVar;
        super.newTextureReady(i, mcjVar, z);
        if (this.duration > -1 && this.startTime != -1 && System.currentTimeMillis() - this.startTime > this.duration && (gqlVar = this.renderFinishListener) != null) {
            gqlVar.onRenderFinish();
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

    public void setRenderFinishListener(gql gqlVar) {
        this.renderFinishListener = gqlVar;
    }

    public void setTimeStamp(long j) {
    }
}
