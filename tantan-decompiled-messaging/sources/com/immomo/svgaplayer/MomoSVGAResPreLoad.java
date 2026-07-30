package com.immomo.svgaplayer;

import android.text.TextUtils;
import com.immomo.svgaplayer.adapter.SVGAResLoadAdapter;
import com.immomo.svgaplayer.adaptercallback.SVGAResLoadCallBack;
import com.immomo.svgaplayer.setting.SVGAAdapterContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\n"}, m87232d2 = {"Lcom/immomo/svgaplayer/MomoSVGAResPreLoad;", "", "()V", "loadRes", "", "resUrl", "", "callback", "Lcom/immomo/svgaplayer/adaptercallback/SVGAResLoadCallBack;", "Companion", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
public final class MomoSVGAResPreLoad {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static MomoSVGAResPreLoad instance;

    private MomoSVGAResPreLoad() {
    }

    public final void loadRes(@NotNull String resUrl, @Nullable SVGAResLoadCallBack callback) {
        SVGAResLoadAdapter mSVGAResLoadAdapter;
        resUrl.getClass();
        if (TextUtils.isEmpty(resUrl) || (mSVGAResLoadAdapter = SVGAAdapterContainer.INSTANCE.getMSVGAResLoadAdapter()) == null) {
            return;
        }
        mSVGAResLoadAdapter.loadSVGARes(false, resUrl, callback);
    }

    @Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, m87232d2 = {"Lcom/immomo/svgaplayer/MomoSVGAResPreLoad$Companion;", "", "()V", "instance", "Lcom/immomo/svgaplayer/MomoSVGAResPreLoad;", "getInstance", "()Lcom/immomo/svgaplayer/MomoSVGAResPreLoad;", "setInstance", "(Lcom/immomo/svgaplayer/MomoSVGAResPreLoad;)V", "get", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        private final MomoSVGAResPreLoad getInstance() {
            if (MomoSVGAResPreLoad.instance == null) {
                MomoSVGAResPreLoad.instance = new MomoSVGAResPreLoad(null);
            }
            return MomoSVGAResPreLoad.instance;
        }

        private final void setInstance(MomoSVGAResPreLoad momoSVGAResPreLoad) {
            MomoSVGAResPreLoad.instance = momoSVGAResPreLoad;
        }

        @NotNull
        public final MomoSVGAResPreLoad get() {
            MomoSVGAResPreLoad companion = getInstance();
            if (companion == null) {
                Intrinsics.m87497m();
            }
            return companion;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MomoSVGAResPreLoad(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
