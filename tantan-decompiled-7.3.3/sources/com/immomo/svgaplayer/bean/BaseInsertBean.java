package com.immomo.svgaplayer.bean;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Lcom/immomo/svgaplayer/bean/BaseInsertBean;", "", "()V", "action", "", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "isClick", "", "()Z", "setClick", "(Z)V", Constants.KEY_KEY, "getKey", "setKey", "type", "", "getType", "()I", "setType", "(I)V", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
public class BaseInsertBean {
    private boolean isClick;
    private int type;

    @NotNull
    private String key = "";

    @NotNull
    private String action = "";

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: isClick, reason: from getter */
    public final boolean getIsClick() {
        return this.isClick;
    }

    public final void setAction(@NotNull String str) {
        str.getClass();
        this.action = str;
    }

    public final void setClick(boolean z) {
        this.isClick = z;
    }

    public final void setKey(@NotNull String str) {
        str.getClass();
        this.key = str;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
