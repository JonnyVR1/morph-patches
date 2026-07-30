package com.p046p1.mobile.putong.live.base.apibean;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.data.OMSSwipeMoment;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import p149l.cll;
import p149l.vwb;

/* JADX INFO: loaded from: classes13.dex */
public class PaginationBean {

    @SerializedName("lastId")
    private String lastId;

    @SerializedName("lastPage")
    private boolean lastPage;

    @SerializedName("lastTimestamp")
    private long lastTimestamp;

    @SerializedName(Constants.KEY_LIMIT)
    private int limit;

    @SerializedName("links")
    private Links links;

    @SerializedName("total")
    private int total;

    public static class Links {

        @SerializedName("next")
        private String next;

        @SerializedName("previous")
        private String previous;

        public String getNext() {
            return this.next;
        }

        public String getPrevious() {
            return this.previous;
        }

        public void setNext(String str) {
            this.next = str;
        }

        public void setPrevious(String str) {
            this.previous = str;
        }
    }

    public static void normalize(Links links) {
        if (links != null) {
            links.next = normalizeUrl(links.next);
            links.previous = normalizeUrl(links.previous);
        }
    }

    public static String normalizeUrl(String str) {
        cll cllVarM107501r;
        if (str == null || (cllVarM107501r = cll.m107501r(str)) == null) {
            return null;
        }
        boolean zEquals = cllVarM107501r.m107522m().equals("graph.facebook.com");
        int iM107511E = cllVarM107501r.m107511E();
        cll.C16188a c16188aM107535b = new cll.C16188a().m107552v("http").m107540h("a.b.com").m107535b("a");
        for (int i = 0; i < iM107511E; i++) {
            String strM107508B = cllVarM107501r.m107508B(i);
            if (zEquals) {
                if (strM107508B.equals(OMSSwipeMoment.after)) {
                    return cllVarM107501r.m107510D(i);
                }
            } else if (strM107508B.equals("since") || strM107508B.equals("until") || strM107508B.equals(Constants.KEY_LIMIT) || strM107508B.equals(IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET) || strM107508B.equals(OMSTemplateModeType.page) || strM107508B.equals("gid") || strM107508B.equals("countle") || strM107508B.equals(BLivePkInviteSource.query) || strM107508B.equals("untilFeedId") || strM107508B.equals("sort") || strM107508B.equals("haveRead") || strM107508B.equals("untilSortId") || strM107508B.equals("maxHaveReadSortId")) {
                c16188aM107535b = c16188aM107535b.m107536c(strM107508B, cllVarM107501r.m107510D(i));
            }
        }
        return vwb.m200331j(vwb.m200331j(c16188aM107535b.m107537d().toString(), "http://a.b.com/a"), "?");
    }

    public String getLastId() {
        return this.lastId;
    }

    public long getLastTimestamp() {
        return this.lastTimestamp;
    }

    public int getLimit() {
        return this.limit;
    }

    public Links getLinks() {
        return this.links;
    }

    public String getProcessedNext() {
        Links links = this.links;
        return links != null ? links.next : "";
    }

    public String getProcessedPrevious() {
        Links links = this.links;
        return links != null ? links.previous : "";
    }

    public int getTotal() {
        return this.total;
    }

    public boolean isLastPage() {
        return this.lastPage;
    }

    public void setLastId(String str) {
        this.lastId = str;
    }

    public void setLastPage(boolean z) {
        this.lastPage = z;
    }

    public void setLastTimestamp(long j) {
        this.lastTimestamp = j;
    }

    public void setLimit(int i) {
        this.limit = i;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public void setTotal(int i) {
        this.total = i;
    }
}
