package com.p051p1.mobile.putong.core.data;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.DbLinks;
import java.util.ArrayList;
import java.util.List;
import p153l.vg60;

/* JADX INFO: loaded from: classes10.dex */
public class PartialListOpt<T> {
    public final DbLinks links;
    public final List<T> loaded;
    private boolean refreshRender = true;
    private RefreshReason refreshReason = RefreshReason.INIT;
    private String reasonStr = null;

    public enum RefreshReason {
        INIT("init"),
        RENDER_DONE("render_done"),
        SUGGEST_LOAD("suggest_load"),
        DO_BEFORE_LIKE("doBeforeLike"),
        CLEAR_OLD_DATA("clearOldData"),
        INSERT_VIRTUAL_CARD("insertVirtualCard"),
        INSERT_USER_CARD("insertUserCard"),
        NOTIFY_INNER("notifyInner"),
        INSERT_LOCAL_BREAK("insert_local_break"),
        INSERT_LOCAL_FINAL("insert_local_final"),
        REMOVE_LOCAL_CARD("remove_local_card"),
        REMOVE_TOP("remove_top_card"),
        REMOVE_BY_BIFROST("remove_by_bifrost"),
        INSERT_USER_SILENTLY("insertUserSilently"),
        removeUsersById("removeUsersById"),
        removePeiLiaoUsersByIdIfNeed("removePeiLiaoUsersByIdIfNeed"),
        removeUserWhenOnlineMatchSuccess("removeUserWhenOnlineMatchSuccess"),
        clearSuggestedData("clearSuggestedData"),
        removeUserFromSuggested("removeUserFromSuggested"),
        tryRemoveInsertedPicksUser("tryRemoveInsertedPicksUser"),
        checkCardOnce("checkCardOnce"),
        riggerCardGuide("riggerCardGuide"),
        NOTIFY_OUTER("NOTIFY_OUTER"),
        debugRefreshLoad("debugRefreshLoad");

        String reason;

        RefreshReason(String str) {
            this.reason = str;
        }

        public String getReason() {
            return this.reason;
        }
    }

    public PartialListOpt(List<T> list, DbLinks dbLinks) {
        this.loaded = list;
        this.links = dbLinks;
    }

    public static <T> vg60<T> emptyHasMore() {
        return new vg60<>(new ArrayList(0), null);
    }

    public static <T> vg60<T> emptyNoMore() {
        return new vg60<>(new ArrayList(0), DbLinks.new_());
    }

    public String getReasonStr() {
        return TextUtils.isEmpty(this.reasonStr) ? this.refreshReason.getReason() : this.reasonStr;
    }

    public boolean hasMore() {
        DbLinks dbLinks = this.links;
        return dbLinks == null || dbLinks.links.next != null;
    }

    public boolean needRefresh() {
        return this.refreshRender;
    }

    public void resetReason() {
        this.refreshReason = RefreshReason.RENDER_DONE;
    }

    public PartialListOpt setReason(RefreshReason refreshReason) {
        this.refreshReason = refreshReason;
        this.reasonStr = null;
        return this;
    }

    public PartialListOpt setReasonStr(String str) {
        this.reasonStr = str;
        return this;
    }

    public void setRefreshValue(boolean z) {
        this.refreshRender = z;
    }

    public int total() {
        DbLinks dbLinks = this.links;
        if (dbLinks == null) {
            return 0;
        }
        return dbLinks.total;
    }
}
