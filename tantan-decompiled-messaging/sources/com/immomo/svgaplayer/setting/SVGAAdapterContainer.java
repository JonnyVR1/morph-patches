package com.immomo.svgaplayer.setting;

import android.content.Context;
import com.immomo.svgaplayer.adapter.SVGAGotoAdapter;
import com.immomo.svgaplayer.adapter.SVGAImgLoadAdapter;
import com.immomo.svgaplayer.adapter.SVGAResLoadAdapter;
import com.immomo.svgaplayer.adapter.SVGAThreadAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017¨\u0006\u0019"}, m87232d2 = {"Lcom/immomo/svgaplayer/setting/SVGAAdapterContainer;", "", "()V", "setApplicationContext", "context", "Landroid/content/Context;", "setSVGAGotoAdapter", "svgaGoto", "Lcom/immomo/svgaplayer/adapter/SVGAGotoAdapter;", "setSVGAImgLoadAdapter", "svgaImgLoad", "Lcom/immomo/svgaplayer/adapter/SVGAImgLoadAdapter;", "setSVGAMaxSize", "size", "", "setSVGAResLoadAdapter", "svgaResLoad", "Lcom/immomo/svgaplayer/adapter/SVGAResLoadAdapter;", "setSVGATagShow", "isShow", "", "setSVGAThreadAdapter", "svgaThread", "Lcom/immomo/svgaplayer/adapter/SVGAThreadAdapter;", "Companion", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
public final class SVGAAdapterContainer {
    private static SVGAAdapterContainer instance;

    @Nullable
    private static Context mContext;

    @Nullable
    private static SVGAGotoAdapter mSVGAGotoAdapter;

    @Nullable
    private static SVGAImgLoadAdapter mSVGAImgLoadAdapter;

    @Nullable
    private static SVGAResLoadAdapter mSVGAResLoadAdapter;

    @Nullable
    private static SVGAThreadAdapter mSVGAThreadAdapter;
    private static boolean mShowDev;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static int mMaxSize = 10;

    @NotNull
    public final SVGAAdapterContainer setApplicationContext(@NotNull Context context) {
        context.getClass();
        mContext = context;
        return this;
    }

    @NotNull
    public final SVGAAdapterContainer setSVGAGotoAdapter(@NotNull SVGAGotoAdapter svgaGoto) {
        svgaGoto.getClass();
        mSVGAGotoAdapter = svgaGoto;
        return this;
    }

    @NotNull
    public final SVGAAdapterContainer setSVGAImgLoadAdapter(@NotNull SVGAImgLoadAdapter svgaImgLoad) {
        svgaImgLoad.getClass();
        mSVGAImgLoadAdapter = svgaImgLoad;
        return this;
    }

    @NotNull
    public final SVGAAdapterContainer setSVGAMaxSize(int size) {
        mMaxSize = size;
        return this;
    }

    @NotNull
    public final SVGAAdapterContainer setSVGAResLoadAdapter(@NotNull SVGAResLoadAdapter svgaResLoad) {
        svgaResLoad.getClass();
        mSVGAResLoadAdapter = svgaResLoad;
        return this;
    }

    @NotNull
    public final SVGAAdapterContainer setSVGATagShow(boolean isShow) {
        mShowDev = isShow;
        return this;
    }

    @NotNull
    public final SVGAAdapterContainer setSVGAThreadAdapter(@NotNull SVGAThreadAdapter svgaThread) {
        svgaThread.getClass();
        mSVGAThreadAdapter = svgaThread;
        return this;
    }

    @Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u00103\u001a\u00020\u0004R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00064"}, m87232d2 = {"Lcom/immomo/svgaplayer/setting/SVGAAdapterContainer$Companion;", "", "()V", "instance", "Lcom/immomo/svgaplayer/setting/SVGAAdapterContainer;", "getInstance", "()Lcom/immomo/svgaplayer/setting/SVGAAdapterContainer;", "setInstance", "(Lcom/immomo/svgaplayer/setting/SVGAAdapterContainer;)V", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mMaxSize", "", "getMMaxSize", "()I", "setMMaxSize", "(I)V", "mSVGAGotoAdapter", "Lcom/immomo/svgaplayer/adapter/SVGAGotoAdapter;", "getMSVGAGotoAdapter", "()Lcom/immomo/svgaplayer/adapter/SVGAGotoAdapter;", "setMSVGAGotoAdapter", "(Lcom/immomo/svgaplayer/adapter/SVGAGotoAdapter;)V", "mSVGAImgLoadAdapter", "Lcom/immomo/svgaplayer/adapter/SVGAImgLoadAdapter;", "getMSVGAImgLoadAdapter", "()Lcom/immomo/svgaplayer/adapter/SVGAImgLoadAdapter;", "setMSVGAImgLoadAdapter", "(Lcom/immomo/svgaplayer/adapter/SVGAImgLoadAdapter;)V", "mSVGAResLoadAdapter", "Lcom/immomo/svgaplayer/adapter/SVGAResLoadAdapter;", "getMSVGAResLoadAdapter", "()Lcom/immomo/svgaplayer/adapter/SVGAResLoadAdapter;", "setMSVGAResLoadAdapter", "(Lcom/immomo/svgaplayer/adapter/SVGAResLoadAdapter;)V", "mSVGAThreadAdapter", "Lcom/immomo/svgaplayer/adapter/SVGAThreadAdapter;", "getMSVGAThreadAdapter", "()Lcom/immomo/svgaplayer/adapter/SVGAThreadAdapter;", "setMSVGAThreadAdapter", "(Lcom/immomo/svgaplayer/adapter/SVGAThreadAdapter;)V", "mShowDev", "", "getMShowDev", "()Z", "setMShowDev", "(Z)V", "get", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        private final SVGAAdapterContainer getInstance() {
            if (SVGAAdapterContainer.instance == null) {
                SVGAAdapterContainer.instance = new SVGAAdapterContainer();
            }
            return SVGAAdapterContainer.instance;
        }

        private final void setInstance(SVGAAdapterContainer sVGAAdapterContainer) {
            SVGAAdapterContainer.instance = sVGAAdapterContainer;
        }

        @NotNull
        public final SVGAAdapterContainer get() {
            SVGAAdapterContainer companion = getInstance();
            if (companion == null) {
                Intrinsics.m87497m();
            }
            return companion;
        }

        @Nullable
        public final Context getMContext() {
            return SVGAAdapterContainer.mContext;
        }

        public final int getMMaxSize() {
            return SVGAAdapterContainer.mMaxSize;
        }

        @Nullable
        public final SVGAGotoAdapter getMSVGAGotoAdapter() {
            return SVGAAdapterContainer.mSVGAGotoAdapter;
        }

        @Nullable
        public final SVGAImgLoadAdapter getMSVGAImgLoadAdapter() {
            return SVGAAdapterContainer.mSVGAImgLoadAdapter;
        }

        @Nullable
        public final SVGAResLoadAdapter getMSVGAResLoadAdapter() {
            return SVGAAdapterContainer.mSVGAResLoadAdapter;
        }

        @Nullable
        public final SVGAThreadAdapter getMSVGAThreadAdapter() {
            return SVGAAdapterContainer.mSVGAThreadAdapter;
        }

        public final boolean getMShowDev() {
            return SVGAAdapterContainer.mShowDev;
        }

        public final void setMContext(@Nullable Context context) {
            SVGAAdapterContainer.mContext = context;
        }

        public final void setMMaxSize(int i) {
            SVGAAdapterContainer.mMaxSize = i;
        }

        public final void setMSVGAGotoAdapter(@Nullable SVGAGotoAdapter sVGAGotoAdapter) {
            SVGAAdapterContainer.mSVGAGotoAdapter = sVGAGotoAdapter;
        }

        public final void setMSVGAImgLoadAdapter(@Nullable SVGAImgLoadAdapter sVGAImgLoadAdapter) {
            SVGAAdapterContainer.mSVGAImgLoadAdapter = sVGAImgLoadAdapter;
        }

        public final void setMSVGAResLoadAdapter(@Nullable SVGAResLoadAdapter sVGAResLoadAdapter) {
            SVGAAdapterContainer.mSVGAResLoadAdapter = sVGAResLoadAdapter;
        }

        public final void setMSVGAThreadAdapter(@Nullable SVGAThreadAdapter sVGAThreadAdapter) {
            SVGAAdapterContainer.mSVGAThreadAdapter = sVGAThreadAdapter;
        }

        public final void setMShowDev(boolean z) {
            SVGAAdapterContainer.mShowDev = z;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
