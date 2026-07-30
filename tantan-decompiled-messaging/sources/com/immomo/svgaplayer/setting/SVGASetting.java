package com.immomo.svgaplayer.setting;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m87232d2 = {"Lcom/immomo/svgaplayer/setting/SVGASetting;", "", "()V", "Companion", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
public final class SVGASetting {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m87232d2 = {"Lcom/immomo/svgaplayer/setting/SVGASetting$Companion;", "", "()V", "init", "Lcom/immomo/svgaplayer/setting/SVGAAdapterContainer;", "setCacheMaxSize", "", "maxSize", "", "switchSVGADevTag", "isShow", "", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final SVGAAdapterContainer init() {
            return SVGAAdapterContainer.INSTANCE.get();
        }

        public final void setCacheMaxSize(int maxSize) {
            SVGAAdapterContainer.INSTANCE.get().setSVGAMaxSize(maxSize);
        }

        public final void switchSVGADevTag(boolean isShow) {
            SVGAAdapterContainer.INSTANCE.get().setSVGATagShow(isShow);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
