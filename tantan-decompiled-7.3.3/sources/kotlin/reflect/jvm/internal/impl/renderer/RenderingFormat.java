package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public enum RenderingFormat {
    PLAIN { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.PLAIN
        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        @NotNull
        public String escape(@NotNull String str) {
            str.getClass();
            return str;
        }
    },
    HTML { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML
        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        @NotNull
        public String escape(@NotNull String str) {
            str.getClass();
            return C15493d.m94370F(C15493d.m94370F(str, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    };

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

    /* synthetic */ RenderingFormat(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String escape(@NotNull String str);
}
