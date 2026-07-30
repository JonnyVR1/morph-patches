package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.MemberZoneFilter;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VListCell;
import p151v.VRangeSlider;
import p151v.VScroll;
import p151v.VSlider;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\tJ\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010=\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u00104\u001a\u0004\b;\u00106\"\u0004\b<\u00108R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010H\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u00104\u001a\u0004\bF\u00106\"\u0004\bG\u00108R\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010T\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u00104\u001a\u0004\bR\u00106\"\u0004\bS\u00108R\"\u0010X\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u00104\u001a\u0004\bV\u00106\"\u0004\bW\u00108R\"\u0010_\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010c\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u00104\u001a\u0004\ba\u00106\"\u0004\bb\u00108R&\u0010h\u001a\u0006\u0012\u0002\b\u00030\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010\rR&\u0010k\u001a\u0006\u0012\u0002\b\u00030\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010d\u001a\u0004\bi\u0010f\"\u0004\bj\u0010\rR&\u0010n\u001a\u0006\u0012\u0002\b\u00030\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010d\u001a\u0004\bl\u0010f\"\u0004\bm\u0010\rR&\u0010r\u001a\u0006\u0012\u0002\b\u00030\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010d\u001a\u0004\bp\u0010f\"\u0004\bq\u0010\rR&\u0010u\u001a\u0006\u0012\u0002\b\u00030\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010d\u001a\u0004\bs\u0010f\"\u0004\bt\u0010\rR&\u0010x\u001a\u0006\u0012\u0002\b\u00030\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010d\u001a\u0004\bv\u0010f\"\u0004\bw\u0010\rR\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010yR\u0016\u0010{\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bv\u0010zR&\u0010\u0083\u0001\u001a\u00020|8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\"\u0010\u0088\u0001\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010\u0084\u00018\u0006¢\u0006\u000e\n\u0005\bi\u0010\u0086\u0001\u001a\u0005\b`\u0010\u0087\u0001¨\u0006\u0089\u0001"}, m88121d2 = {"Ll/mqq0;", "Ll/iam;", "Ll/gqq0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "r", "()V", "Lv/VListCell;", OMSTemplateModeType.view, "E", "(Lv/VListCell;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "f", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "j", "(Ll/gqq0;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/core/data/MemberZoneFilter;", "zoneFilter", "B", "(Lcom/p1/mobile/putong/core/data/MemberZoneFilter;)V", "", "min", Constants.PRIORITY_MAX, "F", "(II)V", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/VImage;", "b", "Lv/VImage;", "m", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "Lv/VText;", "c", "Lv/VText;", "get_filter", "()Lv/VText;", "set_filter", "(Lv/VText;)V", "_filter", Constants.INAPP_DATA_TAG, BaseSei.f14624X, "set_save", "_save", "Lv/VScroll;", "e", "Lv/VScroll;", "get_scroll", "()Lv/VScroll;", "set_scroll", "(Lv/VScroll;)V", "_scroll", BLiveStormDanmakuGiftResourceType.f45292l, "set_age_text", "_age_text", "Lv/VRangeSlider;", "g", "Lv/VRangeSlider;", BaseSei.f14626Z, "()Lv/VRangeSlider;", "set_show_ages", "(Lv/VRangeSlider;)V", "_show_ages", "h", "get_search_distance_title", "set_search_distance_title", "_search_distance_title", RXScreenCaptureService.KEY_INDEX, "n", "set_distance_text", "_distance_text", "Lv/VSlider;", "Lv/VSlider;", BaseSei.f14625Y, "()Lv/VSlider;", "set_search_distance", "(Lv/VSlider;)V", "_search_distance", "k", "get_advace_title", "set_advace_title", "_advace_title", "Lv/VListCell;", "q", "()Lv/VListCell;", "set_prefer_match", "_prefer_match", "u", "set_prefer_online", "_prefer_online", ResourceDirection.f39656v, "set_prefer_popular", "_prefer_popular", "o", "p", "set_prefer_auth", "_prefer_auth", "w", "set_prefer_real", "_prefer_real", BLiveStormDanmakuGiftResourceType.f45294s, "set_prefer_more_info", "_prefer_more_info", "Ll/gqq0;", "Lcom/p1/mobile/putong/core/data/MemberZoneFilter;", "editData", "", Constants.KEY_T, "Z", "getShowMatchFilter", "()Z", c4s.C_ZONE, "(Z)V", "showMatchFilter", "Ll/y20;", "", "Ll/y20;", "()Ll/y20;", "updateDistanceText", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class mqq0 implements iam<gqq0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _filter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _save;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VScroll _scroll;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _age_text;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VRangeSlider _show_ages;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _search_distance_title;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _distance_text;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VSlider _search_distance;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _advace_title;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VListCell<?> _prefer_match;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VListCell<?> _prefer_online;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VListCell<?> _prefer_popular;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VListCell<?> _prefer_auth;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VListCell<?> _prefer_real;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VListCell<?> _prefer_more_info;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public gqq0 presenter;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public MemberZoneFilter editData;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public boolean showMatchFilter;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final y20<Float> updateDistanceText;

    /* JADX INFO: renamed from: l.mqq0$a */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"l/mqq0$a", "", "Lv/VRangeSlider;", "slider", "", "fromUser", "", "value", "", "c", "(Lv/VRangeSlider;ZF)V", "minValue", "maxValue", Constants.INAPP_DATA_TAG, "(Lv/VRangeSlider;ZFF)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18678a implements cp50 {
        public C18678a() {
        }

        @Override // p153l.cp50
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo56599a(VRangeSlider slider, boolean fromUser, float value) {
            slider.getClass();
        }

        @Override // p153l.cp50
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo56600b(VRangeSlider slider, boolean fromUser, float minValue, float maxValue) {
            slider.getClass();
            MemberZoneFilter memberZoneFilter = mqq0.this.editData;
            MemberZoneFilter memberZoneFilter2 = null;
            if (memberZoneFilter == null) {
                Intrinsics.m88391r("editData");
                memberZoneFilter = null;
            }
            memberZoneFilter.min_age = (int) minValue;
            MemberZoneFilter memberZoneFilter3 = mqq0.this.editData;
            if (memberZoneFilter3 == null) {
                Intrinsics.m88391r("editData");
                memberZoneFilter3 = null;
            }
            memberZoneFilter3.max_age = (int) maxValue;
            mqq0 mqq0Var = mqq0.this;
            MemberZoneFilter memberZoneFilter4 = mqq0Var.editData;
            if (memberZoneFilter4 == null) {
                Intrinsics.m88391r("editData");
                memberZoneFilter4 = null;
            }
            int i = memberZoneFilter4.min_age;
            MemberZoneFilter memberZoneFilter5 = mqq0.this.editData;
            if (memberZoneFilter5 == null) {
                Intrinsics.m88391r("editData");
            } else {
                memberZoneFilter2 = memberZoneFilter5;
            }
            mqq0Var.m159561F(i, memberZoneFilter2.max_age);
        }
    }

    /* JADX INFO: renamed from: l.mqq0$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m88121d2 = {"l/mqq0$b", "Lv/VRangeSlider$a;", "Lv/VRangeSlider;", "slider", "", "c", "(Lv/VRangeSlider;)V", Constants.INAPP_DATA_TAG, "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18679b implements VRangeSlider.InterfaceC22680a {
        public C18679b() {
        }

        @Override // p153l.dok0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo56667a(VRangeSlider slider) {
            slider.getClass();
        }

        @Override // p153l.dok0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo56668b(VRangeSlider slider) {
            slider.getClass();
            String strM122046b = eqq0.INSTANCE.m122046b();
            MemberZoneFilter memberZoneFilter = mqq0.this.editData;
            MemberZoneFilter memberZoneFilter2 = null;
            if (memberZoneFilter == null) {
                Intrinsics.m88391r("editData");
                memberZoneFilter = null;
            }
            pf60 pf60VarM147494Y = jyb.m147494Y("suggest_see_user_search_max_age", Integer.valueOf(memberZoneFilter.min_age));
            MemberZoneFilter memberZoneFilter3 = mqq0.this.editData;
            if (memberZoneFilter3 == null) {
                Intrinsics.m88391r("editData");
            } else {
                memberZoneFilter2 = memberZoneFilter3;
            }
            i4g0.m138524v("e_advanced_filter_age", strM122046b, pf60VarM147494Y, jyb.m147494Y("suggest_see_user_search_min_age", Integer.valueOf(memberZoneFilter2.max_age)));
        }
    }

    /* JADX INFO: renamed from: l.mqq0$c */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/mqq0$c", "Lv/VSlider$a;", "Lv/VSlider;", "slider", "", "fromUser", "", "value", "", "c", "(Lv/VSlider;ZF)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18680c extends VSlider.AbstractC22683a {
        public C18680c() {
        }

        @Override // p151v.VSlider.AbstractC22683a, p153l.cp50
        /* JADX INFO: renamed from: c */
        public void mo56599a(VSlider slider, boolean fromUser, float value) {
            slider.getClass();
            MemberZoneFilter memberZoneFilter = mqq0.this.editData;
            MemberZoneFilter memberZoneFilter2 = null;
            if (memberZoneFilter == null) {
                Intrinsics.m88391r("editData");
                memberZoneFilter = null;
            }
            memberZoneFilter.nearby = value <= ((float) eqq0.INSTANCE.m122049e());
            MemberZoneFilter memberZoneFilter3 = mqq0.this.editData;
            if (memberZoneFilter3 == null) {
                Intrinsics.m88391r("editData");
            } else {
                memberZoneFilter2 = memberZoneFilter3;
            }
            memberZoneFilter2.radius = (int) value;
            mqq0.this.m159564k().call(Float.valueOf(value));
            super.mo56599a(slider, fromUser, value);
        }
    }

    /* JADX INFO: renamed from: l.mqq0$d */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m88121d2 = {"l/mqq0$d", "Lv/VSlider$b;", "Lv/VSlider;", "slider", "", "c", "(Lv/VSlider;)V", Constants.INAPP_DATA_TAG, "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18681d implements VSlider.InterfaceC22684b {
        public C18681d() {
        }

        @Override // p153l.dok0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo56667a(VSlider slider) {
            slider.getClass();
        }

        @Override // p153l.dok0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo56668b(VSlider slider) {
            slider.getClass();
            String strM122046b = eqq0.INSTANCE.m122046b();
            MemberZoneFilter memberZoneFilter = mqq0.this.editData;
            if (memberZoneFilter == null) {
                Intrinsics.m88391r("editData");
                memberZoneFilter = null;
            }
            i4g0.m138524v("e_advanced_filter_distance", strM122046b, jyb.m147494Y("suggest_see_user_search_radius", Integer.valueOf(memberZoneFilter.radius)));
        }
    }

    public mqq0(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.showMatchFilter = true;
        this.updateDistanceText = new y20() { // from class: l.hqq0
            @Override // p153l.y20
            public final void call(Object obj) {
                mqq0.m159552b(this.f111164a, (Float) obj);
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public static final void m159550A(mqq0 mqq0Var, View view) {
        View viewFindViewById = view.findViewById(ddc0.f87885O);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        bnl0.m105505C0(textView, qa00.f156329p);
        textView.setPadding(0, qa00.f156314a, 0, 0);
        mqq0Var.m159560E((VListCell) view);
    }

    /* JADX INFO: renamed from: a */
    public static String m159551a(float f) {
        return ((int) f) + "km";
    }

    /* JADX INFO: renamed from: b */
    public static void m159552b(mqq0 mqq0Var, Float f) {
        if (f.floatValue() >= 100.0f) {
            mqq0Var.m159567n().setText("100km+");
            return;
        }
        mqq0Var.m159567n().setText(((int) f.floatValue()) + "km");
    }

    /* JADX INFO: renamed from: d */
    public static void m159554d(mqq0 mqq0Var, View view) {
        gqq0 gqq0Var = mqq0Var.presenter;
        if (gqq0Var == null) {
            Intrinsics.m88391r("presenter");
            gqq0Var = null;
        }
        gqq0Var.getDlg().cancel();
    }

    /* JADX INFO: renamed from: e */
    public static void m159555e(mqq0 mqq0Var, View view) {
        gqq0 gqq0Var = mqq0Var.presenter;
        MemberZoneFilter memberZoneFilter = null;
        if (gqq0Var == null) {
            Intrinsics.m88391r("presenter");
            gqq0Var = null;
        }
        MemberZoneFilter memberZoneFilter2 = mqq0Var.editData;
        if (memberZoneFilter2 == null) {
            Intrinsics.m88391r("editData");
        } else {
            memberZoneFilter = memberZoneFilter2;
        }
        gqq0Var.m131423f(memberZoneFilter);
    }

    /* JADX INFO: renamed from: r */
    private final void m159557r() {
        m159576z().setValueFrom(18.0f);
        m159576z().setValueTo(50.0f);
        m159575y().setValueFrom(1.0f);
        m159575y().setValueTo(100.0f);
        bnl0.m105524M(m159569q(), this.showMatchFilter);
        m159576z().mo224211f(new C18678a());
        m159576z().mo224213g(new C18679b());
        m159575y().setLabelFormatter(new ozk0() { // from class: l.iqq0
            @Override // p153l.ozk0
            /* JADX INFO: renamed from: a */
            public final String mo56598a(float f) {
                return mqq0.m159551a(f);
            }
        });
        m159575y().mo224211f(new C18680c());
        m159575y().mo224213g(new C18681d());
        bnl0.m105509E0(m159574x(), new View.OnClickListener() { // from class: l.jqq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mqq0.m159555e(this.f122238a, view);
            }
        });
        ArrayList arrayListM147507f0 = jyb.m147507f0(m159568p(), m159569q(), m159570s(), m159573w(), m159572v(), m159571u());
        arrayListM147507f0.getClass();
        Iterator it = arrayListM147507f0.iterator();
        while (it.hasNext()) {
            bnl0.m105509E0((VListCell) it.next(), new View.OnClickListener() { // from class: l.kqq0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    mqq0.m159550A(this.f128267a, view);
                }
            });
        }
        bnl0.m105509E0(m159566m(), new View.OnClickListener() { // from class: l.lqq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mqq0.m159554d(this.f133242a, view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final void m159558B(@NotNull MemberZoneFilter zoneFilter) {
        zoneFilter.getClass();
        MemberZoneFilter memberZoneFilterMo225055clone = zoneFilter.mo225055clone();
        memberZoneFilterMo225055clone.getClass();
        this.editData = memberZoneFilterMo225055clone;
        MemberZoneFilter memberZoneFilter = null;
        if (memberZoneFilterMo225055clone == null) {
            Intrinsics.m88391r("editData");
            memberZoneFilterMo225055clone = null;
        }
        if (memberZoneFilterMo225055clone.nearby) {
            MemberZoneFilter memberZoneFilter2 = this.editData;
            if (memberZoneFilter2 == null) {
                Intrinsics.m88391r("editData");
                memberZoneFilter2 = null;
            }
            int i = memberZoneFilter2.radius;
            eqq0.Companion companion = eqq0.INSTANCE;
            if (i > companion.m122049e()) {
                MemberZoneFilter memberZoneFilter3 = this.editData;
                if (memberZoneFilter3 == null) {
                    Intrinsics.m88391r("editData");
                    memberZoneFilter3 = null;
                }
                memberZoneFilter3.radius = companion.m122049e();
                MemberZoneFilter memberZoneFilter4 = this.editData;
                if (memberZoneFilter4 == null) {
                    Intrinsics.m88391r("editData");
                } else {
                    memberZoneFilter = memberZoneFilter4;
                }
                zoneFilter.radius = memberZoneFilter.radius;
            }
        }
        m159576z().setValues(Float.valueOf(Math.max(18.0f, zoneFilter.min_age)), Float.valueOf(Math.min(100.0f, zoneFilter.max_age)));
        int i2 = zoneFilter.radius;
        if (i2 < 1) {
            m159575y().setValue(1.0f);
        } else if (i2 > 100) {
            m159575y().setValue(100.0f);
        } else {
            m159575y().setValue(zoneFilter.radius);
        }
        bsj0.m106284t(m159571u(), zoneFilter.online);
        bsj0.m106284t(m159568p(), zoneFilter.certification);
        bsj0.m106284t(m159572v(), zoneFilter.popular);
        bsj0.m106284t(m159570s(), zoneFilter.richMedia);
        bsj0.m106284t(m159573w(), zoneFilter.realFace);
        bsj0.m106284t(m159569q(), zoneFilter.matched);
    }

    /* JADX INFO: renamed from: C */
    public final void m159559C(boolean z) {
        this.showMatchFilter = z;
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    /* JADX INFO: renamed from: E */
    public final void m159560E(VListCell<?> view) {
        bsj0.m106262T(view);
        boolean zM106285u = bsj0.m106285u(view);
        MemberZoneFilter memberZoneFilter = null;
        if (Intrinsics.m88377d(view, m159571u())) {
            MemberZoneFilter memberZoneFilter2 = this.editData;
            if (memberZoneFilter2 == null) {
                Intrinsics.m88391r("editData");
            } else {
                memberZoneFilter = memberZoneFilter2;
            }
            memberZoneFilter.online = zM106285u;
            return;
        }
        if (Intrinsics.m88377d(view, m159572v())) {
            MemberZoneFilter memberZoneFilter3 = this.editData;
            if (memberZoneFilter3 == null) {
                Intrinsics.m88391r("editData");
            } else {
                memberZoneFilter = memberZoneFilter3;
            }
            memberZoneFilter.popular = zM106285u;
            return;
        }
        if (Intrinsics.m88377d(view, m159568p())) {
            MemberZoneFilter memberZoneFilter4 = this.editData;
            if (memberZoneFilter4 == null) {
                Intrinsics.m88391r("editData");
            } else {
                memberZoneFilter = memberZoneFilter4;
            }
            memberZoneFilter.certification = zM106285u;
            return;
        }
        if (Intrinsics.m88377d(view, m159573w())) {
            MemberZoneFilter memberZoneFilter5 = this.editData;
            if (memberZoneFilter5 == null) {
                Intrinsics.m88391r("editData");
            } else {
                memberZoneFilter = memberZoneFilter5;
            }
            memberZoneFilter.realFace = zM106285u;
            return;
        }
        if (Intrinsics.m88377d(view, m159569q())) {
            MemberZoneFilter memberZoneFilter6 = this.editData;
            if (memberZoneFilter6 == null) {
                Intrinsics.m88391r("editData");
            } else {
                memberZoneFilter = memberZoneFilter6;
            }
            memberZoneFilter.matched = zM106285u;
            return;
        }
        if (Intrinsics.m88377d(view, m159570s())) {
            MemberZoneFilter memberZoneFilter7 = this.editData;
            if (memberZoneFilter7 == null) {
                Intrinsics.m88391r("editData");
            } else {
                memberZoneFilter = memberZoneFilter7;
            }
            memberZoneFilter.richMedia = zM106285u;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m159561F(int min, int max) {
        String strValueOf = max >= 50 ? "50+" : String.valueOf(max);
        m159565l().setText(min + " - " + strValueOf);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final View m159562f(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM164352b = nqq0.m164352b(this, inflater, parent);
        viewM164352b.getClass();
        return viewM164352b;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM159562f = m159562f(inflater, parent);
        m159557r();
        return viewM159562f;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull gqq0 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final y20<Float> m159564k() {
        return this.updateDistanceText;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VText m159565l() {
        VText vText = this._age_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_age_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VImage m159566m() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VText m159567n() {
        VText vText = this._distance_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_distance_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VListCell<?> m159568p() {
        VListCell<?> vListCell = this._prefer_auth;
        if (vListCell != null) {
            return vListCell;
        }
        Intrinsics.m88391r("_prefer_auth");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VListCell<?> m159569q() {
        VListCell<?> vListCell = this._prefer_match;
        if (vListCell != null) {
            return vListCell;
        }
        Intrinsics.m88391r("_prefer_match");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VListCell<?> m159570s() {
        VListCell<?> vListCell = this._prefer_more_info;
        if (vListCell != null) {
            return vListCell;
        }
        Intrinsics.m88391r("_prefer_more_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VListCell<?> m159571u() {
        VListCell<?> vListCell = this._prefer_online;
        if (vListCell != null) {
            return vListCell;
        }
        Intrinsics.m88391r("_prefer_online");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VListCell<?> m159572v() {
        VListCell<?> vListCell = this._prefer_popular;
        if (vListCell != null) {
            return vListCell;
        }
        Intrinsics.m88391r("_prefer_popular");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VListCell<?> m159573w() {
        VListCell<?> vListCell = this._prefer_real;
        if (vListCell != null) {
            return vListCell;
        }
        Intrinsics.m88391r("_prefer_real");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VText m159574x() {
        VText vText = this._save;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_save");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VSlider m159575y() {
        VSlider vSlider = this._search_distance;
        if (vSlider != null) {
            return vSlider;
        }
        Intrinsics.m88391r("_search_distance");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VRangeSlider m159576z() {
        VRangeSlider vRangeSlider = this._show_ages;
        if (vRangeSlider != null) {
            return vRangeSlider;
        }
        Intrinsics.m88391r("_show_ages");
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
