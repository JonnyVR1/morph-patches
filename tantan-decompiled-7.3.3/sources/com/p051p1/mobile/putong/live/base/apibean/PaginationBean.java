package com.p051p1.mobile.putong.live.base.apibean;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.data.OMSSwipeMoment;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import p153l.jyb;
import p153l.rnl;

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
        rnl rnlVarM182265r;
        if (str == null || (rnlVarM182265r = rnl.m182265r(str)) == null) {
            return null;
        }
        boolean zEquals = rnlVarM182265r.m182286m().equals("graph.facebook.com");
        int iM182275E = rnlVarM182265r.m182275E();
        rnl.C19886a c19886aM182299b = new rnl.C19886a().m182316v("http").m182304h("a.b.com").m182299b("a");
        for (int i = 0; i < iM182275E; i++) {
            String strM182272B = rnlVarM182265r.m182272B(i);
            if (zEquals) {
                if (strM182272B.equals(OMSSwipeMoment.after)) {
                    return rnlVarM182265r.m182274D(i);
                }
            } else if (strM182272B.equals("since") || strM182272B.equals("until") || strM182272B.equals(Constants.KEY_LIMIT) || strM182272B.equals(IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET) || strM182272B.equals(OMSTemplateModeType.page) || strM182272B.equals("gid") || strM182272B.equals("countle") || strM182272B.equals(BLivePkInviteSource.query) || strM182272B.equals("untilFeedId") || strM182272B.equals("sort") || strM182272B.equals("haveRead") || strM182272B.equals("untilSortId") || strM182272B.equals("maxHaveReadSortId")) {
                c19886aM182299b = c19886aM182299b.m182300c(strM182272B, rnlVarM182265r.m182274D(i));
            }
        }
        return jyb.m147514j(jyb.m147514j(c19886aM182299b.m182301d().toString(), "http://a.b.com/a"), "?");
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
