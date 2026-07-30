package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.MemberZoneFilter;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VListCell;
import p147v.VRangeSlider;
import p147v.VScroll;
import p147v.VSlider;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\tJ\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010=\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u00104\u001a\u0004\b;\u00106\"\u0004\b<\u00108R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010H\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u00104\u001a\u0004\bF\u00106\"\u0004\bG\u00108R\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010T\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u00104\u001a\u0004\bR\u00106\"\u0004\bS\u00108R\"\u0010X\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u00104\u001a\u0004\bV\u00106\"\u0004\bW\u00108R\"\u0010_\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010c\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u00104\u001a\u0004\ba\u00106\"\u0004\bb\u00108R&\u0010h\u001a\u0006\u0012\u0002\b\u00030\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010\rR&\u0010k\u001a\u0006\u0012\u0002\b\u00030\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010d\u001a\u0004\bi\u0010f\"\u0004\bj\u0010\rR&\u0010n\u001a\u0006\u0012\u0002\b\u00030\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010d\u001a\u0004\bl\u0010f\"\u0004\bm\u0010\rR&\u0010r\u001a\u0006\u0012\u0002\b\u00030\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010d\u001a\u0004\bp\u0010f\"\u0004\bq\u0010\rR&\u0010u\u001a\u0006\u0012\u0002\b\u00030\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010d\u001a\u0004\bs\u0010f\"\u0004\bt\u0010\rR&\u0010x\u001a\u0006\u0012\u0002\b\u00030\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010d\u001a\u0004\bv\u0010f\"\u0004\bw\u0010\rR\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010yR\u0016\u0010{\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bv\u0010zR&\u0010\u0083\u0001\u001a\u00020|8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\"\u0010\u0088\u0001\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010\u0084\u00018\u0006¢\u0006\u000e\n\u0005\bi\u0010\u0086\u0001\u001a\u0005\b`\u0010\u0087\u0001¨\u0006\u0089\u0001"}, m87232d2 = {"Ll/hhq0;", "Ll/s7m;", "Ll/bhq0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "r", "()V", "Lv/VListCell;", OMSTemplateModeType.view, "E", "(Lv/VListCell;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "f", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "j", "(Ll/bhq0;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/core/data/MemberZoneFilter;", "zoneFilter", "B", "(Lcom/p1/mobile/putong/core/data/MemberZoneFilter;)V", "", "min", Constants.PRIORITY_MAX, "F", "(II)V", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/VImage;", "b", "Lv/VImage;", "m", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "Lv/VText;", "c", "Lv/VText;", "get_filter", "()Lv/VText;", "set_filter", "(Lv/VText;)V", "_filter", Constants.INAPP_DATA_TAG, BaseSei.f13930X, "set_save", "_save", "Lv/VScroll;", "e", "Lv/VScroll;", "get_scroll", "()Lv/VScroll;", "set_scroll", "(Lv/VScroll;)V", "_scroll", BLiveStormDanmakuGiftResourceType.f44444l, "set_age_text", "_age_text", "Lv/VRangeSlider;", "g", "Lv/VRangeSlider;", BaseSei.f13932Z, "()Lv/VRangeSlider;", "set_show_ages", "(Lv/VRangeSlider;)V", "_show_ages", "h", "get_search_distance_title", "set_search_distance_title", "_search_distance_title", RXScreenCaptureService.KEY_INDEX, "n", "set_distance_text", "_distance_text", "Lv/VSlider;", "Lv/VSlider;", BaseSei.f13931Y, "()Lv/VSlider;", "set_search_distance", "(Lv/VSlider;)V", "_search_distance", "k", "get_advace_title", "set_advace_title", "_advace_title", "Lv/VListCell;", "q", "()Lv/VListCell;", "set_prefer_match", "_prefer_match", "u", "set_prefer_online", "_prefer_online", ResourceDirection.f38808v, "set_prefer_popular", "_prefer_popular", "o", "p", "set_prefer_auth", "_prefer_auth", "w", "set_prefer_real", "_prefer_real", BLiveStormDanmakuGiftResourceType.f44446s, "set_prefer_more_info", "_prefer_more_info", "Ll/bhq0;", "Lcom/p1/mobile/putong/core/data/MemberZoneFilter;", "editData", "", Constants.KEY_T, "Z", "getShowMatchFilter", "()Z", b2s.C_ZONE, "(Z)V", "showMatchFilter", "Ll/e30;", "", "Ll/e30;", "()Ll/e30;", "updateDistanceText", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class hhq0 implements s7m<bhq0> {

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
    public bhq0 presenter;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public MemberZoneFilter editData;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public boolean showMatchFilter;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final e30<Float> updateDistanceText;

    /* JADX INFO: renamed from: l.hhq0$a */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"l/hhq0$a", "", "Lv/VRangeSlider;", "slider", "", "fromUser", "", "value", "", "c", "(Lv/VRangeSlider;ZF)V", "minValue", "maxValue", Constants.INAPP_DATA_TAG, "(Lv/VRangeSlider;ZFF)V", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17314a implements wg50 {
        public C17314a() {
        }

        @Override // p149l.wg50
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo55416a(VRangeSlider slider, boolean fromUser, float value) {
            slider.getClass();
        }

        @Override // p149l.wg50
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo55417b(VRangeSlider slider, boolean fromUser, float minValue, float maxValue) {
            slider.getClass();
            MemberZoneFilter memberZoneFilter = hhq0.this.editData;
            MemberZoneFilter memberZoneFilter2 = null;
            if (memberZoneFilter == null) {
                Intrinsics.m87502r("editData");
                memberZoneFilter = null;
            }
            memberZoneFilter.min_age = (int) minValue;
            MemberZoneFilter memberZoneFilter3 = hhq0.this.editData;
            if (memberZoneFilter3 == null) {
                Intrinsics.m87502r("editData");
                memberZoneFilter3 = null;
            }
            memberZoneFilter3.max_age = (int) maxValue;
            hhq0 hhq0Var = hhq0.this;
            MemberZoneFilter memberZoneFilter4 = hhq0Var.editData;
            if (memberZoneFilter4 == null) {
                Intrinsics.m87502r("editData");
                memberZoneFilter4 = null;
            }
            int i = memberZoneFilter4.min_age;
            MemberZoneFilter memberZoneFilter5 = hhq0.this.editData;
            if (memberZoneFilter5 == null) {
                Intrinsics.m87502r("editData");
            } else {
                memberZoneFilter2 = memberZoneFilter5;
            }
            hhq0Var.m131108F(i, memberZoneFilter2.max_age);
        }
    }

    /* JADX INFO: renamed from: l.hhq0$b */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m87232d2 = {"l/hhq0$b", "Lv/VRangeSlider$a;", "Lv/VRangeSlider;", "slider", "", "c", "(Lv/VRangeSlider;)V", Constants.INAPP_DATA_TAG, "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17315b implements VRangeSlider.InterfaceC22565a {
        public C17315b() {
        }

        @Override // p149l.xek0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo55484a(VRangeSlider slider) {
            slider.getClass();
        }

        @Override // p149l.xek0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo55485b(VRangeSlider slider) {
            slider.getClass();
            String strM218684b = zgq0.INSTANCE.m218684b();
            MemberZoneFilter memberZoneFilter = hhq0.this.editData;
            MemberZoneFilter memberZoneFilter2 = null;
            if (memberZoneFilter == null) {
                Intrinsics.m87502r("editData");
                memberZoneFilter = null;
            }
            j760 j760VarM200311Y = vwb.m200311Y("suggest_see_user_search_max_age", Integer.valueOf(memberZoneFilter.min_age));
            MemberZoneFilter memberZoneFilter3 = hhq0.this.editData;
            if (memberZoneFilter3 == null) {
                Intrinsics.m87502r("editData");
            } else {
                memberZoneFilter2 = memberZoneFilter3;
            }
            zvf0.m220400v("e_advanced_filter_age", strM218684b, j760VarM200311Y, vwb.m200311Y("suggest_see_user_search_min_age", Integer.valueOf(memberZoneFilter2.max_age)));
        }
    }

    /* JADX INFO: renamed from: l.hhq0$c */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"l/hhq0$c", "Lv/VSlider$a;", "Lv/VSlider;", "slider", "", "fromUser", "", "value", "", "c", "(Lv/VSlider;ZF)V", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17316c extends VSlider.AbstractC22568a {
        public C17316c() {
        }

        @Override // p147v.VSlider.AbstractC22568a, p149l.wg50
        /* JADX INFO: renamed from: c */
        public void mo55416a(VSlider slider, boolean fromUser, float value) {
            slider.getClass();
            MemberZoneFilter memberZoneFilter = hhq0.this.editData;
            MemberZoneFilter memberZoneFilter2 = null;
            if (memberZoneFilter == null) {
                Intrinsics.m87502r("editData");
                memberZoneFilter = null;
            }
            memberZoneFilter.nearby = value <= ((float) zgq0.INSTANCE.m218687e());
            MemberZoneFilter memberZoneFilter3 = hhq0.this.editData;
            if (memberZoneFilter3 == null) {
                Intrinsics.m87502r("editData");
            } else {
                memberZoneFilter2 = memberZoneFilter3;
            }
            memberZoneFilter2.radius = (int) value;
            hhq0.this.m131111k().call(Float.valueOf(value));
            super.mo55416a(slider, fromUser, value);
        }
    }

    /* JADX INFO: renamed from: l.hhq0$d */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m87232d2 = {"l/hhq0$d", "Lv/VSlider$b;", "Lv/VSlider;", "slider", "", "c", "(Lv/VSlider;)V", Constants.INAPP_DATA_TAG, "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17317d implements VSlider.InterfaceC22569b {
        public C17317d() {
        }

        @Override // p149l.xek0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo55484a(VSlider slider) {
            slider.getClass();
        }

        @Override // p149l.xek0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo55485b(VSlider slider) {
            slider.getClass();
            String strM218684b = zgq0.INSTANCE.m218684b();
            MemberZoneFilter memberZoneFilter = hhq0.this.editData;
            if (memberZoneFilter == null) {
                Intrinsics.m87502r("editData");
                memberZoneFilter = null;
            }
            zvf0.m220400v("e_advanced_filter_distance", strM218684b, vwb.m200311Y("suggest_see_user_search_radius", Integer.valueOf(memberZoneFilter.radius)));
        }
    }

    public hhq0(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.showMatchFilter = true;
        this.updateDistanceText = new e30() { // from class: l.chq0
            @Override // p149l.e30
            public final void call(Object obj) {
                hhq0.m131099b(this.f80996a, (Float) obj);
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public static final void m131097A(hhq0 hhq0Var, View view) {
        View viewFindViewById = view.findViewById(x4c0.f190980O);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        xdl0.m208325C0(textView, t100.f167267p);
        textView.setPadding(0, t100.f167252a, 0, 0);
        hhq0Var.m131107E((VListCell) view);
    }

    /* JADX INFO: renamed from: a */
    public static String m131098a(float f) {
        return ((int) f) + "km";
    }

    /* JADX INFO: renamed from: b */
    public static void m131099b(hhq0 hhq0Var, Float f) {
        if (f.floatValue() >= 100.0f) {
            hhq0Var.m131114n().setText("100km+");
            return;
        }
        hhq0Var.m131114n().setText(((int) f.floatValue()) + "km");
    }

    /* JADX INFO: renamed from: d */
    public static void m131101d(hhq0 hhq0Var, View view) {
        bhq0 bhq0Var = hhq0Var.presenter;
        if (bhq0Var == null) {
            Intrinsics.m87502r("presenter");
            bhq0Var = null;
        }
        bhq0Var.getDlg().cancel();
    }

    /* JADX INFO: renamed from: e */
    public static void m131102e(hhq0 hhq0Var, View view) {
        bhq0 bhq0Var = hhq0Var.presenter;
        MemberZoneFilter memberZoneFilter = null;
        if (bhq0Var == null) {
            Intrinsics.m87502r("presenter");
            bhq0Var = null;
        }
        MemberZoneFilter memberZoneFilter2 = hhq0Var.editData;
        if (memberZoneFilter2 == null) {
            Intrinsics.m87502r("editData");
        } else {
            memberZoneFilter = memberZoneFilter2;
        }
        bhq0Var.m101915f(memberZoneFilter);
    }

    /* JADX INFO: renamed from: r */
    private final void m131104r() {
        m131123z().setValueFrom(18.0f);
        m131123z().setValueTo(50.0f);
        m131122y().setValueFrom(1.0f);
        m131122y().setValueTo(100.0f);
        xdl0.m208344M(m131116q(), this.showMatchFilter);
        m131123z().mo222965f(new C17314a());
        m131123z().mo222967g(new C17315b());
        m131122y().setLabelFormatter(new iqk0() { // from class: l.dhq0
            @Override // p149l.iqk0
            /* JADX INFO: renamed from: a */
            public final String mo55415a(float f) {
                return hhq0.m131098a(f);
            }
        });
        m131122y().mo222965f(new C17316c());
        m131122y().mo222967g(new C17317d());
        xdl0.m208329E0(m131121x(), new View.OnClickListener() { // from class: l.ehq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hhq0.m131102e(this.f91371a, view);
            }
        });
        ArrayList arrayListM200324f0 = vwb.m200324f0(m131115p(), m131116q(), m131117s(), m131120w(), m131119v(), m131118u());
        arrayListM200324f0.getClass();
        Iterator it = arrayListM200324f0.iterator();
        while (it.hasNext()) {
            xdl0.m208329E0((VListCell) it.next(), new View.OnClickListener() { // from class: l.fhq0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    hhq0.m131097A(this.f97540a, view);
                }
            });
        }
        xdl0.m208329E0(m131113m(), new View.OnClickListener() { // from class: l.ghq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hhq0.m131101d(this.f102677a, view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final void m131105B(@NotNull MemberZoneFilter zoneFilter) {
        zoneFilter.getClass();
        MemberZoneFilter memberZoneFilterMo223809clone = zoneFilter.mo223809clone();
        memberZoneFilterMo223809clone.getClass();
        this.editData = memberZoneFilterMo223809clone;
        MemberZoneFilter memberZoneFilter = null;
        if (memberZoneFilterMo223809clone == null) {
            Intrinsics.m87502r("editData");
            memberZoneFilterMo223809clone = null;
        }
        if (memberZoneFilterMo223809clone.nearby) {
            MemberZoneFilter memberZoneFilter2 = this.editData;
            if (memberZoneFilter2 == null) {
                Intrinsics.m87502r("editData");
                memberZoneFilter2 = null;
            }
            int i = memberZoneFilter2.radius;
            zgq0.Companion companion = zgq0.INSTANCE;
            if (i > companion.m218687e()) {
                MemberZoneFilter memberZoneFilter3 = this.editData;
                if (memberZoneFilter3 == null) {
                    Intrinsics.m87502r("editData");
                    memberZoneFilter3 = null;
                }
                memberZoneFilter3.radius = companion.m218687e();
                MemberZoneFilter memberZoneFilter4 = this.editData;
                if (memberZoneFilter4 == null) {
                    Intrinsics.m87502r("editData");
                } else {
                    memberZoneFilter = memberZoneFilter4;
                }
                zoneFilter.radius = memberZoneFilter.radius;
            }
        }
        m131123z().setValues(Float.valueOf(Math.max(18.0f, zoneFilter.min_age)), Float.valueOf(Math.min(100.0f, zoneFilter.max_age)));
        int i2 = zoneFilter.radius;
        if (i2 < 1) {
            m131122y().setValue(1.0f);
        } else if (i2 > 100) {
            m131122y().setValue(100.0f);
        } else {
            m131122y().setValue(zoneFilter.radius);
        }
        yij0.m214964t(m131118u(), zoneFilter.online);
        yij0.m214964t(m131115p(), zoneFilter.certification);
        yij0.m214964t(m131119v(), zoneFilter.popular);
        yij0.m214964t(m131117s(), zoneFilter.richMedia);
        yij0.m214964t(m131120w(), zoneFilter.realFace);
        yij0.m214964t(m131116q(), zoneFilter.matched);
    }

    /* JADX INFO: renamed from: C */
    public final void m131106C(boolean z) {
        this.showMatchFilter = z;
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    /* JADX INFO: renamed from: E */
    public final void m131107E(VListCell<?> view) {
        yij0.m214942T(view);
        boolean zM214965u = yij0.m214965u(view);
        MemberZoneFilter memberZoneFilter = null;
        if (Intrinsics.m87488d(view, m131118u())) {
            MemberZoneFilter memberZoneFilter2 = this.editData;
            if (memberZoneFilter2 == null) {
                Intrinsics.m87502r("editData");
            } else {
                memberZoneFilter = memberZoneFilter2;
            }
            memberZoneFilter.online = zM214965u;
            return;
        }
        if (Intrinsics.m87488d(view, m131119v())) {
            MemberZoneFilter memberZoneFilter3 = this.editData;
            if (memberZoneFilter3 == null) {
                Intrinsics.m87502r("editData");
            } else {
                memberZoneFilter = memberZoneFilter3;
            }
            memberZoneFilter.popular = zM214965u;
            return;
        }
        if (Intrinsics.m87488d(view, m131115p())) {
            MemberZoneFilter memberZoneFilter4 = this.editData;
            if (memberZoneFilter4 == null) {
                Intrinsics.m87502r("editData");
            } else {
                memberZoneFilter = memberZoneFilter4;
            }
            memberZoneFilter.certification = zM214965u;
            return;
        }
        if (Intrinsics.m87488d(view, m131120w())) {
            MemberZoneFilter memberZoneFilter5 = this.editData;
            if (memberZoneFilter5 == null) {
                Intrinsics.m87502r("editData");
            } else {
                memberZoneFilter = memberZoneFilter5;
            }
            memberZoneFilter.realFace = zM214965u;
            return;
        }
        if (Intrinsics.m87488d(view, m131116q())) {
            MemberZoneFilter memberZoneFilter6 = this.editData;
            if (memberZoneFilter6 == null) {
                Intrinsics.m87502r("editData");
            } else {
                memberZoneFilter = memberZoneFilter6;
            }
            memberZoneFilter.matched = zM214965u;
            return;
        }
        if (Intrinsics.m87488d(view, m131117s())) {
            MemberZoneFilter memberZoneFilter7 = this.editData;
            if (memberZoneFilter7 == null) {
                Intrinsics.m87502r("editData");
            } else {
                memberZoneFilter = memberZoneFilter7;
            }
            memberZoneFilter.richMedia = zM214965u;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m131108F(int min, int max) {
        String strValueOf = max >= 50 ? "50+" : String.valueOf(max);
        m131112l().setText(min + " - " + strValueOf);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final View m131109f(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM136268b = ihq0.m136268b(this, inflater, parent);
        viewM136268b.getClass();
        return viewM136268b;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM131109f = m131109f(inflater, parent);
        m131104r();
        return viewM131109f;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull bhq0 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final e30<Float> m131111k() {
        return this.updateDistanceText;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VText m131112l() {
        VText vText = this._age_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_age_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VImage m131113m() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VText m131114n() {
        VText vText = this._distance_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_distance_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VListCell<?> m131115p() {
        VListCell<?> vListCell = this._prefer_auth;
        if (vListCell != null) {
            return vListCell;
        }
        Intrinsics.m87502r("_prefer_auth");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VListCell<?> m131116q() {
        VListCell<?> vListCell = this._prefer_match;
        if (vListCell != null) {
            return vListCell;
        }
        Intrinsics.m87502r("_prefer_match");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VListCell<?> m131117s() {
        VListCell<?> vListCell = this._prefer_more_info;
        if (vListCell != null) {
            return vListCell;
        }
        Intrinsics.m87502r("_prefer_more_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VListCell<?> m131118u() {
        VListCell<?> vListCell = this._prefer_online;
        if (vListCell != null) {
            return vListCell;
        }
        Intrinsics.m87502r("_prefer_online");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VListCell<?> m131119v() {
        VListCell<?> vListCell = this._prefer_popular;
        if (vListCell != null) {
            return vListCell;
        }
        Intrinsics.m87502r("_prefer_popular");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VListCell<?> m131120w() {
        VListCell<?> vListCell = this._prefer_real;
        if (vListCell != null) {
            return vListCell;
        }
        Intrinsics.m87502r("_prefer_real");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VText m131121x() {
        VText vText = this._save;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_save");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VSlider m131122y() {
        VSlider vSlider = this._search_distance;
        if (vSlider != null) {
            return vSlider;
        }
        Intrinsics.m87502r("_search_distance");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VRangeSlider m131123z() {
        VRangeSlider vRangeSlider = this._show_ages;
        if (vRangeSlider != null) {
            return vRangeSlider;
        }
        Intrinsics.m87502r("_show_ages");
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
