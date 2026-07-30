package p006l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b.\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\r\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b$\u0010\bR\u0017\u0010/\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u00101\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b\u0013\u0010\b¨\u00062"}, d2 = {"Ll/kp3;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "getCORE_LOVE_BUZZ_BEE", "()Ljava/lang/String;", "CORE_LOVE_BUZZ_BEE", "b", "getCORE_LOVE_BUZZ_TITLE", "CORE_LOVE_BUZZ_TITLE", "c", "getCORE_LOVE_BUZZ_TITLE_EN", "CORE_LOVE_BUZZ_TITLE_EN", "d", "getCORE_VOICE_BUZZ_SEARCH_BEE", "CORE_VOICE_BUZZ_SEARCH_BEE", "e", "n", "CORE_VOICE_BUZZ_CALLING", "f", "getCORE_VIDEO_BUZZ_SEARCH_BEE", "CORE_VIDEO_BUZZ_SEARCH_BEE", "g", "m", "CORE_BUZZ_WHITE_CONNECT_ANIM", "h", "CORE_BUZZ_BLACK_CONNECT_ANIM", "i", "CORE_BUZZ_MATCH_ANIM", "j", "CORE_BUZZ_COMBO_ANIM", "k", "CORE_BUZZ_SELF_LIKE_ANIM", "l", "CORE_BUZZ_VIDEO_PASSIVE_POP_ANIM", "CORE_BUZZ_TEXT_PASSIVE_POP_ANIM", "CORE_BUZZ_VOICE_PASSIVE_POP_ANIM", "o", "CORE_BUZZ_RETURN_FREE_COUNT_ANIM", "p", "CORE_BUZZ_BUNDLE_NOTIFY_ANIM", "q", "CORE_BUZZ_WATER_RIPPLE_ANIM", "r", "CORE_BUZZ_MEMOJI_PASSIVE_MALE_ANIM", "s", "CORE_BUZZ_MEMOJI_PASSIVE_FEMALE_ANIM", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class kp3 {

    @NotNull
    public static final kp3 INSTANCE = new kp3();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String CORE_LOVE_BUZZ_BEE = "https://auto.tancdn.com/v1/raw/9684d1f3-8cf6-4692-ab2c-5caeaf9d40b111.svga";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String CORE_LOVE_BUZZ_TITLE = "https://auto.tancdn.com/v1/raw/e4d829e1-69da-4347-9415-9a5cc0c413c610.svga";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final String CORE_LOVE_BUZZ_TITLE_EN = "https://auto.tancdn.com/v1/raw/3165b3ad-d035-4c1f-a844-dcba7eb3701611.svga";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final String CORE_VOICE_BUZZ_SEARCH_BEE = "https://auto.tancdn.com/v1/raw/3cf6d2cb-fa6f-4ec4-9426-bfa3b4d3aea812.svga";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final String CORE_VOICE_BUZZ_CALLING = "https://auto.tancdn.com/v1/raw/d85a3936-2c13-42f8-a870-b9ffaa935e9d12.svga";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final String CORE_VIDEO_BUZZ_SEARCH_BEE = "https://auto.tancdn.com/v1/raw/bbc98ee0-7936-4745-8728-c57de63d44ae12.svga";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final String CORE_BUZZ_WHITE_CONNECT_ANIM = "https://auto.tancdn.com/v1/raw/40949691-819d-482f-bb96-5860bb2a68db12.svga";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final String CORE_BUZZ_BLACK_CONNECT_ANIM = "https://auto.tancdn.com/v1/raw/905dfc67-da0a-4ec5-8ade-1192b8efd6ef12.svga";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final String CORE_BUZZ_MATCH_ANIM = "https://auto.tancdn.com/v1/raw/91000f90-0a6e-42bd-97c7-f49e6af00cf012.svga";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public static final String CORE_BUZZ_COMBO_ANIM = "https://auto.tancdn.com/v1/raw/200fe088-dcd9-42db-af3f-488e8d06426c13.svga";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public static final String CORE_BUZZ_SELF_LIKE_ANIM = "https://auto.tancdn.com/v1/raw/93f65e0f-dc33-45f5-b765-8fddce4a07d313.svga";

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public static final String CORE_BUZZ_VIDEO_PASSIVE_POP_ANIM = "https://auto.tancdn.com/v1/raw/89a74603-e2fc-4b50-88bc-deda119cec4b13.svga";

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final String CORE_BUZZ_TEXT_PASSIVE_POP_ANIM = "https://auto.tancdn.com/v1/raw/1619e04d-b514-48c2-954b-290bc35bdaeb12.svga";

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public static final String CORE_BUZZ_VOICE_PASSIVE_POP_ANIM = "https://auto.tancdn.com/v1/raw/343134ef-6297-4862-a0d3-a8483f29dcb713.svga";

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public static final String CORE_BUZZ_RETURN_FREE_COUNT_ANIM = "https://auto.tancdn.com/v1/raw/1c9c7c95-9876-4245-85a0-f391d5f4543613.svga";

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public static final String CORE_BUZZ_BUNDLE_NOTIFY_ANIM = "https://auto.tancdn.com/v1/raw/1e0e92d5-9109-4e85-892a-078e53b643f813.svga";

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public static final String CORE_BUZZ_WATER_RIPPLE_ANIM = "https://auto.tancdn.com/v1/raw/0e0c5c27-26e6-4c87-a5f4-0c5e8bfee70b13.svga";

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public static final String CORE_BUZZ_MEMOJI_PASSIVE_MALE_ANIM = "https://auto.tancdn.com/v1/raw/048cabd9-8dce-488a-a17c-8d1292d839a612.svga";

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public static final String CORE_BUZZ_MEMOJI_PASSIVE_FEMALE_ANIM = "https://auto.tancdn.com/v1/raw/5468ead0-90a8-410e-b7d1-139d77fa6e4213.svga";

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m18238a() {
        return CORE_BUZZ_BLACK_CONNECT_ANIM;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m18239b() {
        return CORE_BUZZ_BUNDLE_NOTIFY_ANIM;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m18240c() {
        return CORE_BUZZ_COMBO_ANIM;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m18241d() {
        return CORE_BUZZ_MATCH_ANIM;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m18242e() {
        return CORE_BUZZ_MEMOJI_PASSIVE_FEMALE_ANIM;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m18243f() {
        return CORE_BUZZ_MEMOJI_PASSIVE_MALE_ANIM;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m18244g() {
        return CORE_BUZZ_RETURN_FREE_COUNT_ANIM;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m18245h() {
        return CORE_BUZZ_SELF_LIKE_ANIM;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m18246i() {
        return CORE_BUZZ_TEXT_PASSIVE_POP_ANIM;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final String m18247j() {
        return CORE_BUZZ_VIDEO_PASSIVE_POP_ANIM;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final String m18248k() {
        return CORE_BUZZ_VOICE_PASSIVE_POP_ANIM;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final String m18249l() {
        return CORE_BUZZ_WATER_RIPPLE_ANIM;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final String m18250m() {
        return CORE_BUZZ_WHITE_CONNECT_ANIM;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final String m18251n() {
        return CORE_VOICE_BUZZ_CALLING;
    }
}
