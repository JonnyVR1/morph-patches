package com.p051p1.mobile.putong.core.newui.profile.newme.revamp.common;

import android.graphics.Color;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.badge.BadgeDrawable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VText_NoTopPadding;
import p153l.bnl0;
import p153l.c6p;
import p153l.c9c0;
import p153l.d79;
import p153l.dbc0;
import p153l.gta;
import p153l.k3d0;
import p153l.nbr;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001a\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\n2\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\r\"\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper;", "", "<init>", "()V", "Lcom/p1/mobile/putong/app/PutongFrag;", "frag", "Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$a;", "views", "Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$CardType;", "type", "", "e", "(Lcom/p1/mobile/putong/app/PutongFrag;Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$a;Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$CardType;)V", "", Constants.INAPP_DATA_TAG, "([Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$a;)V", "Lv/VText_NoTopPadding;", SocialConstants.PARAM_APP_DESC, "b", "(Lv/VText_NoTopPadding;Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$CardType;)V", "c", "(Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$a;Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$CardType;)V", "Lv/VDraweeView;", "bgLine", "a", "(Lv/VDraweeView;Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$CardType;)V", "CardType", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class MeTabRevampMemberCardHelper {

    @NotNull
    public static final MeTabRevampMemberCardHelper INSTANCE = new MeTabRevampMemberCardHelper();

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$CardType;", "", "<init>", "(Ljava/lang/String;I)V", "VIP", "SEE", "PREMIUM", "ULTRA", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public enum CardType {
        VIP,
        SEE,
        PREMIUM,
        ULTRA;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        @NotNull
        public static EnumEntries<CardType> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newme.revamp.common.MeTabRevampMemberCardHelper$a */
    @Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u0019\u0010 R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001d\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b#\u0010'R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006("}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$a;", "", "Landroid/view/ViewGroup;", "root", "Lv/VDraweeView;", "privilegeBg", "bgRes", "titleRes", "Lv/VText_NoTopPadding;", SocialConstants.PARAM_APP_DESC, "Lcom/tantan/library/svga/SVGAnimationView;", "privilegeSvga", "privilegeIcon", "<init>", "(Landroid/view/ViewGroup;Lv/VDraweeView;Lv/VDraweeView;Lv/VDraweeView;Lv/VText_NoTopPadding;Lcom/tantan/library/svga/SVGAnimationView;Lv/VDraweeView;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/view/ViewGroup;", "f", "()Landroid/view/ViewGroup;", "b", "Lv/VDraweeView;", "c", "()Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "g", "e", "Lv/VText_NoTopPadding;", "()Lv/VText_NoTopPadding;", "Lcom/tantan/library/svga/SVGAnimationView;", "()Lcom/tantan/library/svga/SVGAnimationView;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* data */ class C8376a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final ViewGroup root;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final VDraweeView privilegeBg;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final VDraweeView bgRes;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final VDraweeView titleRes;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final VText_NoTopPadding desc;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final SVGAnimationView privilegeSvga;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final VDraweeView privilegeIcon;

        public C8376a(@NotNull ViewGroup viewGroup, @NotNull VDraweeView vDraweeView, @NotNull VDraweeView vDraweeView2, @NotNull VDraweeView vDraweeView3, @NotNull VText_NoTopPadding vText_NoTopPadding, @NotNull SVGAnimationView sVGAnimationView, @NotNull VDraweeView vDraweeView4) {
            viewGroup.getClass();
            vDraweeView.getClass();
            vDraweeView2.getClass();
            vDraweeView3.getClass();
            vText_NoTopPadding.getClass();
            sVGAnimationView.getClass();
            vDraweeView4.getClass();
            this.root = viewGroup;
            this.privilegeBg = vDraweeView;
            this.bgRes = vDraweeView2;
            this.titleRes = vDraweeView3;
            this.desc = vText_NoTopPadding;
            this.privilegeSvga = sVGAnimationView;
            this.privilegeIcon = vDraweeView4;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final VDraweeView getBgRes() {
            return this.bgRes;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final VText_NoTopPadding getDesc() {
            return this.desc;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final VDraweeView getPrivilegeBg() {
            return this.privilegeBg;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final VDraweeView getPrivilegeIcon() {
            return this.privilegeIcon;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final SVGAnimationView getPrivilegeSvga() {
            return this.privilegeSvga;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C8376a)) {
                return false;
            }
            C8376a c8376a = (C8376a) other;
            return Intrinsics.m88377d(this.root, c8376a.root) && Intrinsics.m88377d(this.privilegeBg, c8376a.privilegeBg) && Intrinsics.m88377d(this.bgRes, c8376a.bgRes) && Intrinsics.m88377d(this.titleRes, c8376a.titleRes) && Intrinsics.m88377d(this.desc, c8376a.desc) && Intrinsics.m88377d(this.privilegeSvga, c8376a.privilegeSvga) && Intrinsics.m88377d(this.privilegeIcon, c8376a.privilegeIcon);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final ViewGroup getRoot() {
            return this.root;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final VDraweeView getTitleRes() {
            return this.titleRes;
        }

        public int hashCode() {
            return (((((((((((this.root.hashCode() * 31) + this.privilegeBg.hashCode()) * 31) + this.bgRes.hashCode()) * 31) + this.titleRes.hashCode()) * 31) + this.desc.hashCode()) * 31) + this.privilegeSvga.hashCode()) * 31) + this.privilegeIcon.hashCode();
        }

        @NotNull
        public String toString() {
            return "Views(root=" + this.root + ", privilegeBg=" + this.privilegeBg + ", bgRes=" + this.bgRes + ", titleRes=" + this.titleRes + ", desc=" + this.desc + ", privilegeSvga=" + this.privilegeSvga + ", privilegeIcon=" + this.privilegeIcon + ")";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newme.revamp.common.MeTabRevampMemberCardHelper$b */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C8377b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f27362a;

        static {
            int[] iArr = new int[CardType.values().length];
            try {
                iArr[CardType.VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardType.SEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardType.PREMIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardType.ULTRA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f27362a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m44310a(VDraweeView bgLine, CardType type) {
        int i = C8377b.f27362a[type.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            bnl0.m105524M(bgLine, true);
        } else if (i == 4) {
            bnl0.m105524M(bgLine, false);
        } else {
            nbr.m162172a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m44311b(VText_NoTopPadding desc, CardType type) {
        int iM175859d;
        desc.setTextSize(10.0f);
        desc.setMaxLines(2);
        bnl0.m105538V(desc, qa00.m175859d(20.0f));
        bnl0.m105540X(desc, 0);
        bnl0.m105537U(desc, qa00.m175859d(24.0f));
        ViewGroup.LayoutParams layoutParams = desc.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = BadgeDrawable.BOTTOM_START;
        }
        int i = C8377b.f27362a[type.ordinal()];
        if (i != 2) {
            iM175859d = i != 3 ? qa00.m175859d(114.0f) : qa00.m175859d(107.0f);
        } else {
            iM175859d = qa00.m175859d(128.0f);
        }
        bnl0.m105539W(desc, iM175859d);
    }

    /* JADX INFO: renamed from: c */
    public final void m44312c(C8376a views, CardType type) {
        int iM175859d;
        int[] iArr = C8377b.f27362a;
        int i = iArr[type.ordinal()];
        if (i == 1) {
            iM175859d = qa00.m175859d(0.0f);
        } else {
            if (i != 2 && i != 3 && i != 4) {
                nbr.m162172a();
                return;
            }
            iM175859d = qa00.m175859d(5.0f);
        }
        int i2 = iArr[type.ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
            nbr.m162172a();
            return;
        }
        int iM175859d2 = qa00.m175859d(14.0f);
        bnl0.m105539W(views.getPrivilegeSvga(), iM175859d2);
        bnl0.m105539W(views.getPrivilegeIcon(), iM175859d2);
        bnl0.m105540X(views.getPrivilegeSvga(), iM175859d);
        bnl0.m105540X(views.getPrivilegeIcon(), iM175859d);
    }

    /* JADX INFO: renamed from: d */
    public final void m44313d(@NotNull C8376a... views) {
        views.getClass();
        for (C8376a c8376a : views) {
            if (bnl0.m105529O0(c8376a.getPrivilegeSvga())) {
                c8376a.getPrivilegeSvga().startAnimation();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m44314e(@NotNull PutongFrag frag, @NotNull C8376a views, @NotNull CardType type) {
        String str;
        frag.getClass();
        views.getClass();
        type.getClass();
        boolean zM108173c = c6p.INSTANCE.m108173c();
        m44311b(views.getDesc(), type);
        m44312c(views, type);
        int i = C8377b.f27362a[type.ordinal()];
        if (i == 1) {
            bnl0.m105505C0(views.getTitleRes(), qa00.m175859d(50.0f));
            bnl0.m105507D0(qa00.m175859d(200.0f), views.getTitleRes());
            views.getTitleRes().setImageURI("res:///" + dbc0.f87053he);
            views.getBgRes().setImageURI("res:///" + dbc0.f86503Qe);
            uqb0.f180374G.m127115L0(views.getPrivilegeBg(), "https://auto.tancdn.com/v1/raw/e8b29481-f896-46bc-ab7e-7e55e6ed79cd13.webp");
            String string = gta.m132210e().m132214d().mo34737Oi() ? frag.getString(R$string.f19364jb) : frag.getString(R$string.f19335ib);
            string.getClass();
            bnl0.m105515H0(views.getDesc(), string);
            views.getDesc().setTextColor(App.f16088e.getColor(c9c0.f80319A0));
            str = zM108173c ? "https://auto.tancdn.com/v1/raw/2ed0984b-7f46-42e2-822e-9d62b2b29e6512.webp" : "https://auto.tancdn.com/v1/raw/38e4b498-9444-4d29-a7ea-245d30cebe0e13.svga";
        } else if (i == 2) {
            bnl0.m105505C0(views.getTitleRes(), qa00.m175859d(50.0f));
            bnl0.m105507D0(qa00.m175859d(200.0f), views.getTitleRes());
            views.getBgRes().setImageURI("res:///" + dbc0.f87608ye);
            uqb0.f180374G.m127115L0(views.getPrivilegeBg(), "https://auto.tancdn.com/v1/raw/61e0afa6-ee39-4395-8db3-33bca36e2cce12.webp");
            views.getTitleRes().setImageURI("res:///" + dbc0.f87020ge);
            bnl0.m105515H0(views.getDesc(), frag.getString(R$string.f19088ab));
            views.getDesc().setTextColor(App.f16088e.getColor(c9c0.f80473y0));
            str = zM108173c ? "https://auto.tancdn.com/v1/raw/921bb0ae-bdb9-42c8-b925-9a73055a03b812.webp" : "https://auto.tancdn.com/v1/raw/77496448-f42c-42bb-920e-17a31df068a012.svga";
        } else if (i == 3) {
            bnl0.m105505C0(views.getTitleRes(), qa00.m175859d(50.0f));
            bnl0.m105507D0(qa00.m175859d(200.0f), views.getTitleRes());
            views.getBgRes().setImageURI("res:///" + dbc0.f87576xe);
            uqb0.f180374G.m127115L0(views.getPrivilegeBg(), "https://auto.tancdn.com/v1/raw/05a984c6-bbd6-46e7-aa86-3b4a1f0f6afe12.webp");
            views.getTitleRes().setImageURI("res:///" + dbc0.f86987fe);
            if (d79.m114663V()) {
                bnl0.m105515H0(views.getDesc(), k3d0.m148007c(R$string.f19806xj));
            } else {
                bnl0.m105515H0(views.getDesc(), k3d0.m148007c(R$string.f18997Xa));
            }
            views.getDesc().setTextColor(Color.parseColor("#A38F5F"));
            str = zM108173c ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik41VUVTQVdKWERXWVBCNEZXVVNWT0VJT0hGRFIyVTE0IiwidyI6MjQwLCJoIjoyNDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3MjIwMTE5ODU2NzcwNjk1OTh9.png" : "https://auto.tancdn.com/v1/raw/60258e67-0a45-4eeb-8a7c-69c0a14d319614.svga";
        } else {
            if (i != 4) {
                nbr.m162172a();
                return;
            }
            bnl0.m105505C0(views.getTitleRes(), qa00.m175859d(50.0f));
            bnl0.m105507D0(qa00.m175859d(200.0f), views.getTitleRes());
            uqb0.f180374G.m127115L0(views.getBgRes(), "");
            views.getPrivilegeBg().setImageURI("res:///" + dbc0.f86439Oe);
            views.getTitleRes().setImageURI("res:///" + dbc0.f86471Pe);
            if (IntlCountryCodeController.m29125v()) {
                bnl0.m105515H0(views.getDesc(), k3d0.m148007c(R$string.f19868zj));
            } else {
                bnl0.m105515H0(views.getDesc(), k3d0.m148007c(R$string.f19837yj));
            }
            views.getDesc().setTextColor(Color.parseColor("#66FFFFFF"));
            str = zM108173c ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkVVSTdYN1YzM1lTU0tWRERJS0hGUTJBV0FXV1k3MjE0IiwidyI6MTYwLCJoIjoxNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTkyMzcyNzE5ODQ3NTY0NTYzfQ.png" : "https://auto.tancdn.com/v1/raw/c4394906-acb9-4366-8edb-9b402f98cad114.svga";
        }
        m44310a(views.getBgRes(), type);
        bnl0.m105524M(views.getPrivilegeSvga(), !zM108173c);
        bnl0.m105524M(views.getPrivilegeIcon(), zM108173c);
        if (str.length() > 0) {
            if (zM108173c) {
                uqb0.f180374G.m127115L0(views.getPrivilegeIcon(), str);
            } else {
                Act act = frag.act();
                act.getClass();
                SVGALoader.with(act).repeatCount(1).autoPlay(false).from(str).into(views.getPrivilegeSvga());
            }
        }
        views.getRoot().setClipChildren(true);
        views.getRoot().setClipToPadding(true);
        views.getRoot().setOutlineProvider(ViewOutlineProvider.BOUNDS);
        views.getRoot().setClipToOutline(true);
    }
}
