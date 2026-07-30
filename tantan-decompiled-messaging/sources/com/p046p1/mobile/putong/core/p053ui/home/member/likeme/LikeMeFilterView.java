package com.p046p1.mobile.putong.core.p053ui.home.member.likeme;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.e30;
import p149l.o7r;
import p149l.ycr;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010\"\u001a\u00020\u00192*\u0010!\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020 0\u001f0\u001e\"\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b\"\u0010#J/\u0010(\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0007H\u0014¢\u0006\u0004\b(\u0010)R\"\u00100\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00107\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010>\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010C\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010\u001dR\"\u0010G\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u00109\u001a\u0004\bE\u0010;\"\u0004\bF\u0010=R\"\u0010K\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u00109\u001a\u0004\bI\u0010;\"\u0004\bJ\u0010=R\"\u0010O\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u00109\u001a\u0004\bM\u0010;\"\u0004\bN\u0010=R\"\u0010S\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u00109\u001a\u0004\bQ\u0010;\"\u0004\bR\u0010=R\"\u0010W\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u00109\u001a\u0004\bU\u0010;\"\u0004\bV\u0010=R\"\u0010[\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u00109\u001a\u0004\bY\u0010;\"\u0004\bZ\u0010=R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010\u001bR*\u0010g\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010n¨\u0006p"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/home/member/likeme/LikeMeFilterView;", "Landroid/widget/HorizontalScrollView;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View;", ResourceDirection.f38808v, "", "c", "(Landroid/view/View;)Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "a", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/ui/home/member/likeme/LikeMeFilterView$a;", "callback", "", "b", "(Lcom/p1/mobile/putong/core/ui/home/member/likeme/LikeMeFilterView$a;)V", "onClick", "(Landroid/view/View;)V", "", "Lkotlin/Pair;", "", "types", Constants.INAPP_DATA_TAG, "([Lkotlin/Pair;)V", BLiveStormDanmakuGiftResourceType.f44444l, Constants.KEY_T, "oldl", "oldt", "onScrollChanged", "(IIII)V", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "get_linear", "()Landroid/widget/LinearLayout;", "set_linear", "(Landroid/widget/LinearLayout;)V", "_linear", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "get_match_filter", "()Landroid/widget/FrameLayout;", "set_match_filter", "(Landroid/widget/FrameLayout;)V", "_match_filter", "Lv/VText;", "Lv/VText;", "get_match_filter_match_text", "()Lv/VText;", "set_match_filter_match_text", "(Lv/VText;)V", "_match_filter_match_text", "Landroid/view/View;", "get_match_filter_match_dot", "()Landroid/view/View;", "set_match_filter_match_dot", "_match_filter_match_dot", "e", "get_nearby_filter", "set_nearby_filter", "_nearby_filter", "f", "get_online_filter", "set_online_filter", "_online_filter", "g", "get_pop_filter", "set_pop_filter", "_pop_filter", "h", "get_verified_filter", "set_verified_filter", "_verified_filter", RXScreenCaptureService.KEY_INDEX, "get_real_avatar_filter", "set_real_avatar_filter", "_real_avatar_filter", "j", "get_info_rich_filter", "set_info_rich_filter", "_info_rich_filter", "k", "Lcom/p1/mobile/putong/core/ui/home/member/likeme/LikeMeFilterView$a;", "getCallback", "()Lcom/p1/mobile/putong/core/ui/home/member/likeme/LikeMeFilterView$a;", "setCallback", "Ll/e30;", "Ll/e30;", "getOnScrollChangeBottom", "()Ll/e30;", "setOnScrollChangeBottom", "(Ll/e30;)V", "onScrollChangeBottom", "", "m", "J", "getLastClickTime", "()J", "setLastClickTime", "(J)V", "lastClickTime", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class LikeMeFilterView extends HorizontalScrollView implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public LinearLayout _linear;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public FrameLayout _match_filter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _match_filter_match_text;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public View _match_filter_match_dot;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _nearby_filter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _online_filter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _pop_filter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _verified_filter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _real_avatar_filter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _info_rich_filter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public InterfaceC8372a callback;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public e30<Boolean> onScrollChangeBottom;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public long lastClickTime;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.home.member.likeme.LikeMeFilterView$a */
    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/home/member/likeme/LikeMeFilterView$a;", "", "", "type", "Landroid/view/View;", OMSTemplateModeType.view, "", "a", "(Ljava/lang/String;Landroid/view/View;)Z", "", "b", "(Ljava/lang/String;Landroid/view/View;)V", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface InterfaceC8372a {
        /* JADX INFO: renamed from: a */
        boolean mo46092a(@NotNull String type, @NotNull View view);

        /* JADX INFO: renamed from: b */
        void mo46093b(@NotNull String type, @NotNull View view);
    }

    public /* synthetic */ LikeMeFilterView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m46088a(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM214204b = ycr.m214204b(this, inflater, parent);
        viewM214204b.getClass();
        return viewM214204b;
    }

    /* JADX INFO: renamed from: b */
    public final void m46089b(@NotNull InterfaceC8372a callback) {
        callback.getClass();
        this.callback = callback;
        get_match_filter().setOnClickListener(this);
        get_nearby_filter().setOnClickListener(this);
        get_online_filter().setOnClickListener(this);
        get_pop_filter().setOnClickListener(this);
        get_verified_filter().setOnClickListener(this);
        get_real_avatar_filter().setOnClickListener(this);
        get_info_rich_filter().setOnClickListener(this);
    }

    /* JADX INFO: renamed from: c */
    public final String m46090c(View v2) {
        if (Intrinsics.m87488d(v2, get_match_filter())) {
            return "match_filter";
        }
        if (Intrinsics.m87488d(v2, get_nearby_filter())) {
            return "NEARBY_FILTER";
        }
        if (Intrinsics.m87488d(v2, get_online_filter())) {
            return "ONLINE_FILTER";
        }
        if (Intrinsics.m87488d(v2, get_pop_filter())) {
            return "POP_FILTER";
        }
        if (Intrinsics.m87488d(v2, get_verified_filter())) {
            return "VERIFIED_FILTER";
        }
        if (Intrinsics.m87488d(v2, get_real_avatar_filter())) {
            return "REAL_AVATAR_FILTER";
        }
        if (Intrinsics.m87488d(v2, get_info_rich_filter())) {
            return "INFO_RICH_FILTER";
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    public final void m46091d(@NotNull Pair<String, Boolean>... types) {
        types.getClass();
        for (Pair<String, Boolean> pair : types) {
            String first = pair.getFirst();
            switch (first.hashCode()) {
                case -1666779075:
                    if (first.equals("REAL_AVATAR_FILTER")) {
                        get_real_avatar_filter().setSelected(pair.getSecond().booleanValue());
                    }
                    break;
                case -1417978554:
                    if (first.equals("POP_FILTER")) {
                        get_pop_filter().setSelected(pair.getSecond().booleanValue());
                    }
                    break;
                case -1293615921:
                    if (first.equals("VERIFIED_FILTER")) {
                        get_verified_filter().setSelected(pair.getSecond().booleanValue());
                    }
                    break;
                case 419192548:
                    if (first.equals("ONLINE_FILTER")) {
                        get_online_filter().setSelected(pair.getSecond().booleanValue());
                    }
                    break;
                case 1079910712:
                    if (first.equals("NEARBY_FILTER")) {
                        get_nearby_filter().setSelected(pair.getSecond().booleanValue());
                    }
                    break;
                case 1107056434:
                    if (first.equals("match_filter")) {
                        get_match_filter().setSelected(pair.getSecond().booleanValue());
                    }
                    break;
                case 1743721002:
                    if (first.equals("INFO_RICH_FILTER")) {
                        get_info_rich_filter().setSelected(pair.getSecond().booleanValue());
                    }
                    break;
            }
        }
    }

    @Nullable
    public final InterfaceC8372a getCallback() {
        return this.callback;
    }

    public final long getLastClickTime() {
        return this.lastClickTime;
    }

    @Nullable
    public final e30<Boolean> getOnScrollChangeBottom() {
        return this.onScrollChangeBottom;
    }

    @NotNull
    public final VText get_info_rich_filter() {
        VText vText = this._info_rich_filter;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_info_rich_filter");
        return null;
    }

    @NotNull
    public final LinearLayout get_linear() {
        LinearLayout linearLayout = this._linear;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_linear");
        return null;
    }

    @NotNull
    public final FrameLayout get_match_filter() {
        FrameLayout frameLayout = this._match_filter;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_match_filter");
        return null;
    }

    @NotNull
    public final View get_match_filter_match_dot() {
        View view = this._match_filter_match_dot;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_match_filter_match_dot");
        return null;
    }

    @NotNull
    public final VText get_match_filter_match_text() {
        VText vText = this._match_filter_match_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_match_filter_match_text");
        return null;
    }

    @NotNull
    public final VText get_nearby_filter() {
        VText vText = this._nearby_filter;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_nearby_filter");
        return null;
    }

    @NotNull
    public final VText get_online_filter() {
        VText vText = this._online_filter;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_online_filter");
        return null;
    }

    @NotNull
    public final VText get_pop_filter() {
        VText vText = this._pop_filter;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_pop_filter");
        return null;
    }

    @NotNull
    public final VText get_real_avatar_filter() {
        VText vText = this._real_avatar_filter;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_real_avatar_filter");
        return null;
    }

    @NotNull
    public final VText get_verified_filter() {
        VText vText = this._verified_filter;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_verified_filter");
        return null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v2) {
        v2.getClass();
        if (SystemClock.uptimeMillis() - this.lastClickTime < 500) {
            return;
        }
        this.lastClickTime = SystemClock.uptimeMillis();
        String strM46090c = m46090c(v2);
        if (strM46090c != null) {
            InterfaceC8372a interfaceC8372a = this.callback;
            if (interfaceC8372a != null ? interfaceC8372a.mo46092a(strM46090c, v2) : true) {
                v2.setSelected(!v2.isSelected());
                InterfaceC8372a interfaceC8372a2 = this.callback;
                if (interfaceC8372a2 != null) {
                    interfaceC8372a2.mo46093b(strM46090c, v2);
                }
            }
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int l2, int t, int oldl, int oldt) {
        super.onScrollChanged(l2, t, oldl, oldt);
        int width = getWidth() + l2 + getPaddingLeft() + getPaddingRight();
        e30<Boolean> e30Var = this.onScrollChangeBottom;
        if (e30Var != null) {
            e30Var.call(Boolean.valueOf(width >= getChildAt(0).getWidth()));
        }
    }

    public final void setCallback(@Nullable InterfaceC8372a interfaceC8372a) {
        this.callback = interfaceC8372a;
    }

    public final void setLastClickTime(long j) {
        this.lastClickTime = j;
    }

    public final void setOnScrollChangeBottom(@Nullable e30<Boolean> e30Var) {
        this.onScrollChangeBottom = e30Var;
    }

    public final void set_info_rich_filter(@NotNull VText vText) {
        vText.getClass();
        this._info_rich_filter = vText;
    }

    public final void set_linear(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._linear = linearLayout;
    }

    public final void set_match_filter(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._match_filter = frameLayout;
    }

    public final void set_match_filter_match_dot(@NotNull View view) {
        view.getClass();
        this._match_filter_match_dot = view;
    }

    public final void set_match_filter_match_text(@NotNull VText vText) {
        vText.getClass();
        this._match_filter_match_text = vText;
    }

    public final void set_nearby_filter(@NotNull VText vText) {
        vText.getClass();
        this._nearby_filter = vText;
    }

    public final void set_online_filter(@NotNull VText vText) {
        vText.getClass();
        this._online_filter = vText;
    }

    public final void set_pop_filter(@NotNull VText vText) {
        vText.getClass();
        this._pop_filter = vText;
    }

    public final void set_real_avatar_filter(@NotNull VText vText) {
        vText.getClass();
        this._real_avatar_filter = vText;
    }

    public final void set_verified_filter(@NotNull VText vText) {
        vText.getClass();
        this._verified_filter = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LikeMeFilterView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LikeMeFilterView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LikeMeFilterView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(context);
        layoutInflaterM163037a.getClass();
        m46088a(layoutInflaterM163037a, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LikeMeFilterView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
