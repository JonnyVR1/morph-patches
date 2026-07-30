package com.bytedance.bpea.basics;

import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m88121d2 = {"Lcom/bytedance/bpea/basics/BPEALogUtil;", "", "()V", "TAG", "", Constants.INAPP_DATA_TAG, "", "msg", "tag", "e", RXScreenCaptureService.KEY_INDEX, "w", "basics_release"}, m88122k = 1, m88123mv = {1, 1, 16})
public final class BPEALogUtil {
    public static final BPEALogUtil INSTANCE = new BPEALogUtil();
    private static final String TAG = "BPEA";

    private BPEALogUtil() {
    }

    /* JADX INFO: renamed from: d */
    public final void m5710d(@NotNull String tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
    }

    /* JADX INFO: renamed from: e */
    public final void m5712e(@NotNull String tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
        Log.e("BPEA_" + tag, msg);
    }

    /* JADX INFO: renamed from: i */
    public final void m5714i(@NotNull String tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
    }

    /* JADX INFO: renamed from: w */
    public final void m5716w(@NotNull String tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
    }

    /* JADX INFO: renamed from: d */
    public final void m5709d(@NotNull String msg) {
        msg.getClass();
    }

    /* JADX INFO: renamed from: i */
    public final void m5713i(@NotNull String msg) {
        msg.getClass();
    }

    /* JADX INFO: renamed from: w */
    public final void m5715w(@NotNull String msg) {
        msg.getClass();
    }

    /* JADX INFO: renamed from: e */
    public final void m5711e(@NotNull String msg) {
        msg.getClass();
        Log.e(TAG, msg);
    }
}
