package com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.AbstractC0618v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.OMSSwipeMoment;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKTVSong;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvChooseSongPageView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bnl0;
import p153l.obc0;
import p153l.p2r;
import p153l.w2r;
import p153l.xau;
import p153l.yec0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u0000 \u0092\u00012\u00020\u00012\u00020\u0002:\u0004\u0093\u0001\u0094\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0013J\u001d\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J+\u0010'\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u001e¢\u0006\u0004\b*\u0010!J\u001d\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020\u001e¢\u0006\u0004\b-\u0010.J\u001d\u00102\u001a\u00020\u000b2\u000e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/¢\u0006\u0004\b2\u00103J\u001d\u00104\u001a\u00020\u000b2\u000e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/¢\u0006\u0004\b4\u00103R\"\u0010;\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010R\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010V\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010M\u001a\u0004\bT\u0010O\"\u0004\bU\u0010QR\"\u0010Z\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010M\u001a\u0004\bX\u0010O\"\u0004\bY\u0010QR\"\u0010^\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010M\u001a\u0004\b\\\u0010O\"\u0004\b]\u0010QR\"\u0010f\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010j\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010a\u001a\u0004\bh\u0010c\"\u0004\bi\u0010eR\"\u0010r\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010z\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR%\u0010\u0082\u0001\u001a\u00020{8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R(\u0010\u0088\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0005\b\u0087\u0001\u0010\u0011R)\u0010\u008f\u0001\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0095\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/ktv/view/KtvChooseSongPageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/TextView$OnEditorActionListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "n0", "(Landroid/view/View;)V", "", FirebaseAnalytics.Param.INDEX, "p0", "(I)V", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/livingroom/virtual/ktv/view/KtvChooseSongPageView$b;", "changeTagListener", "t0", "(Lcom/p1/mobile/putong/live/livingroom/virtual/ktv/view/KtvChooseSongPageView$b;)V", "q0", "Ll/p2r;", "cusAdapter", "searchAdapter", "s0", "(Ll/p2r;Ll/p2r;)V", "", "withUpdate", "o0", "(Z)V", "Landroid/widget/TextView;", ResourceDirection.f39656v, "actionId", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "onEditorAction", "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z", "isShow", "v0", "", "action", "u0", "(Ljava/lang/String;Z)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceKTVSong;", "newData", "setListData", "(Ljava/util/List;)V", "setSearchListData", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/livingroom/virtual/ktv/view/KtvChooseSongPageView;", "get_rootView", "()Lcom/p1/mobile/putong/live/livingroom/virtual/ktv/view/KtvChooseSongPageView;", "set_rootView", "(Lcom/p1/mobile/putong/live/livingroom/virtual/ktv/view/KtvChooseSongPageView;)V", "_rootView", "Landroid/widget/EditText;", "e", "Landroid/widget/EditText;", "get_search_edit", "()Landroid/widget/EditText;", "set_search_edit", "(Landroid/widget/EditText;)V", "_search_edit", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "get_cancel_icon", "()Landroid/widget/ImageView;", "set_cancel_icon", "(Landroid/widget/ImageView;)V", "_cancel_icon", "g", "Landroid/widget/TextView;", "get_cancel_bt", "()Landroid/widget/TextView;", "set_cancel_bt", "(Landroid/widget/TextView;)V", "_cancel_bt", "h", "get_hot_music", "set_hot_music", "_hot_music", RXScreenCaptureService.KEY_INDEX, "get_recommend_music", "set_recommend_music", "_recommend_music", "j", "get_recently_music", "set_recently_music", "_recently_music", "Lv/VRecyclerView;", "k", "Lv/VRecyclerView;", "get_recyclerView", "()Lv/VRecyclerView;", "set_recyclerView", "(Lv/VRecyclerView;)V", "_recyclerView", BLiveStormDanmakuGiftResourceType.f45292l, "get_searchRecyclerView", "set_searchRecyclerView", "_searchRecyclerView", "Lv/VLinear;", "m", "Lv/VLinear;", "get_empty", "()Lv/VLinear;", "set_empty", "(Lv/VLinear;)V", "_empty", "Lv/VImage;", "n", "Lv/VImage;", "get_empty_icon", "()Lv/VImage;", "set_empty_icon", "(Lv/VImage;)V", "_empty_icon", "Lv/VText;", "o", "Lv/VText;", "get_empty_text", "()Lv/VText;", "set_empty_text", "(Lv/VText;)V", "_empty_text", "p", "I", "getListType", "()I", "setListType", "listType", "q", "Ljava/lang/String;", "getSearchString", "()Ljava/lang/String;", "setSearchString", "(Ljava/lang/String;)V", "searchString", "r", "Lcom/p1/mobile/putong/live/livingroom/virtual/ktv/view/KtvChooseSongPageView$b;", "Companion", "a", "b", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class KtvChooseSongPageView extends ConstraintLayout implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public KtvChooseSongPageView _rootView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public EditText _search_edit;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ImageView _cancel_icon;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public TextView _cancel_bt;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public TextView _hot_music;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public TextView _recommend_music;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public TextView _recently_music;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VRecyclerView _recyclerView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VRecyclerView _searchRecyclerView;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VLinear _empty;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VImage _empty_icon;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VText _empty_text;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int listType;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public String searchString;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public InterfaceC13123b changeTagListener;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvChooseSongPageView$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/ktv/view/KtvChooseSongPageView$a;", "", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Lcom/p1/mobile/putong/live/livingroom/virtual/ktv/view/KtvChooseSongPageView;", "a", "(Landroid/view/LayoutInflater;)Lcom/p1/mobile/putong/live/livingroom/virtual/ktv/view/KtvChooseSongPageView;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final KtvChooseSongPageView m78240a(@NotNull LayoutInflater inflater) {
            inflater.getClass();
            View viewInflate = inflater.inflate(yec0.f199169m9, (ViewGroup) null, false);
            viewInflate.getClass();
            return (KtvChooseSongPageView) viewInflate;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvChooseSongPageView$b */
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/ktv/view/KtvChooseSongPageView$b;", "", "", FirebaseAnalytics.Param.INDEX, "", "L", "(I)V", "", "content", "d2", "(Ljava/lang/String;)V", "", "withUpdate", "P", "(Z)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC13123b {
        /* JADX INFO: renamed from: L */
        void mo78241L(int index);

        /* JADX INFO: renamed from: P */
        void mo78242P(boolean withUpdate);

        /* JADX INFO: renamed from: d2 */
        void mo78243d2(@NotNull String content);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvChooseSongPageView$c */
    @Metadata(m88120d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/virtual/ktv/view/KtvChooseSongPageView$c", "Landroid/text/TextWatcher;", "", BLiveStormDanmakuGiftResourceType.f45294s, "", "start", "count", OMSSwipeMoment.after, "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", OMSSwipeMoment.before, "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C13124c implements TextWatcher {
        public C13124c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            KtvChooseSongPageView.this.setSearchString(String.valueOf(s));
            bnl0.m105524M(KtvChooseSongPageView.this.get_cancel_icon(), !TextUtils.isEmpty(KtvChooseSongPageView.this.getSearchString()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KtvChooseSongPageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.searchString = "";
    }

    /* JADX INFO: renamed from: h0 */
    public static void m78225h0(KtvChooseSongPageView ktvChooseSongPageView, View view) {
        ktvChooseSongPageView.m78234p0(1);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m78226i0(KtvChooseSongPageView ktvChooseSongPageView, View view) {
        ktvChooseSongPageView.m78234p0(2);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m78227j0(KtvChooseSongPageView ktvChooseSongPageView, View view, boolean z) {
        if (z) {
            ktvChooseSongPageView.m78239v0(true);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static void m78228k0(KtvChooseSongPageView ktvChooseSongPageView, View view) {
        ktvChooseSongPageView.m78233o0(true);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m78229l0(KtvChooseSongPageView ktvChooseSongPageView, View view) {
        ktvChooseSongPageView.m78234p0(0);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m78230m0(KtvChooseSongPageView ktvChooseSongPageView, View view) {
        ktvChooseSongPageView.get_search_edit().setText(SpannableStringBuilder.valueOf(""));
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: r0 */
    public static final KtvChooseSongPageView m78231r0(@NotNull LayoutInflater layoutInflater) {
        return INSTANCE.m78240a(layoutInflater);
    }

    public final int getListType() {
        return this.listType;
    }

    @NotNull
    public final String getSearchString() {
        return this.searchString;
    }

    @NotNull
    public final TextView get_cancel_bt() {
        TextView textView = this._cancel_bt;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_cancel_bt");
        return null;
    }

    @NotNull
    public final ImageView get_cancel_icon() {
        ImageView imageView = this._cancel_icon;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_cancel_icon");
        return null;
    }

    @NotNull
    public final VLinear get_empty() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    public final VImage get_empty_icon() {
        VImage vImage = this._empty_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_empty_icon");
        return null;
    }

    @NotNull
    public final VText get_empty_text() {
        VText vText = this._empty_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_empty_text");
        return null;
    }

    @NotNull
    public final TextView get_hot_music() {
        TextView textView = this._hot_music;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_hot_music");
        return null;
    }

    @NotNull
    public final TextView get_recently_music() {
        TextView textView = this._recently_music;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_recently_music");
        return null;
    }

    @NotNull
    public final TextView get_recommend_music() {
        TextView textView = this._recommend_music;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_recommend_music");
        return null;
    }

    @NotNull
    public final VRecyclerView get_recyclerView() {
        VRecyclerView vRecyclerView = this._recyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_recyclerView");
        return null;
    }

    @NotNull
    public final KtvChooseSongPageView get_rootView() {
        KtvChooseSongPageView ktvChooseSongPageView = this._rootView;
        if (ktvChooseSongPageView != null) {
            return ktvChooseSongPageView;
        }
        Intrinsics.m88391r("_rootView");
        return null;
    }

    @NotNull
    public final VRecyclerView get_searchRecyclerView() {
        VRecyclerView vRecyclerView = this._searchRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_searchRecyclerView");
        return null;
    }

    @NotNull
    public final EditText get_search_edit() {
        EditText editText = this._search_edit;
        if (editText != null) {
            return editText;
        }
        Intrinsics.m88391r("_search_edit");
        return null;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m78232n0(View view) {
        w2r.m204580a(this, view);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m78233o0(boolean withUpdate) {
        get_search_edit().setText(SpannableStringBuilder.valueOf(""));
        get_search_edit().clearFocus();
        m78239v0(false);
        setSearchListData(new ArrayList());
        InterfaceC13123b interfaceC13123b = this.changeTagListener;
        if (interfaceC13123b != null) {
            interfaceC13123b.mo78242P(withUpdate);
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(@Nullable TextView v2, int actionId, @Nullable KeyEvent event) {
        if (actionId == 3) {
            CharSequence text = v2 != null ? v2.getText() : null;
            if (TextUtils.isEmpty(text)) {
                return true;
            }
            get_search_edit().clearFocus();
            InterfaceC13123b interfaceC13123b = this.changeTagListener;
            if (interfaceC13123b != null) {
                interfaceC13123b.mo78243d2(String.valueOf(text));
            }
        }
        return true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78232n0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m78234p0(int index) {
        this.listType = index;
        get_hot_music().setSelected(index == 0);
        get_recommend_music().setSelected(index == 1);
        get_recently_music().setSelected(index == 2);
        InterfaceC13123b interfaceC13123b = this.changeTagListener;
        if (interfaceC13123b != null) {
            interfaceC13123b.mo78241L(index);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m78235q0() {
        this.searchString = "";
        this.listType = 0;
        get_search_edit().setText("");
        bnl0.m105524M(get_searchRecyclerView(), false);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m78236s0(@NotNull p2r cusAdapter, @NotNull p2r searchAdapter) {
        cusAdapter.getClass();
        searchAdapter.getClass();
        RecyclerView.C0585u c0585u = new RecyclerView.C0585u();
        c0585u.m3440m(0, 20);
        VRecyclerView vRecyclerView = get_recyclerView();
        vRecyclerView.setAdapter(cusAdapter);
        vRecyclerView.setRecycledViewPool(c0585u);
        vRecyclerView.setHasFixedSize(true);
        vRecyclerView.setLayoutManager(new LinearLayoutManager(vRecyclerView.getContext()));
        RecyclerView.AbstractC0576l itemAnimator = vRecyclerView.getItemAnimator();
        itemAnimator.getClass();
        ((AbstractC0618v) itemAnimator).setSupportsChangeAnimations(false);
        VRecyclerView vRecyclerView2 = get_searchRecyclerView();
        vRecyclerView2.setAdapter(searchAdapter);
        vRecyclerView2.setHasFixedSize(true);
        vRecyclerView2.setRecycledViewPool(c0585u);
        vRecyclerView2.setLayoutManager(new LinearLayoutManager(vRecyclerView2.getContext()));
        RecyclerView.AbstractC0576l itemAnimator2 = vRecyclerView2.getItemAnimator();
        itemAnimator2.getClass();
        ((AbstractC0618v) itemAnimator2).setSupportsChangeAnimations(false);
    }

    public final void setListData(@NotNull List<? extends BLiveVoiceKTVSong> newData) {
        newData.getClass();
        get_search_edit().clearFocus();
        if (get_recyclerView().getAdapter() != null) {
            RecyclerView.Adapter adapter = get_recyclerView().getAdapter();
            adapter.getClass();
            ((p2r) adapter).m170382G(newData);
        }
    }

    public final void setListType(int i) {
        this.listType = i;
    }

    public final void setSearchListData(@NotNull List<? extends BLiveVoiceKTVSong> newData) {
        newData.getClass();
        get_search_edit().clearFocus();
        if (get_searchRecyclerView().getAdapter() != null) {
            RecyclerView.Adapter adapter = get_searchRecyclerView().getAdapter();
            adapter.getClass();
            ((p2r) adapter).m170382G(newData);
        }
        get_searchRecyclerView().scrollToPosition(0);
    }

    public final void setSearchString(@NotNull String str) {
        str.getClass();
        this.searchString = str;
    }

    public final void set_cancel_bt(@NotNull TextView textView) {
        textView.getClass();
        this._cancel_bt = textView;
    }

    public final void set_cancel_icon(@NotNull ImageView imageView) {
        imageView.getClass();
        this._cancel_icon = imageView;
    }

    public final void set_empty(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._empty = vLinear;
    }

    public final void set_empty_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._empty_icon = vImage;
    }

    public final void set_empty_text(@NotNull VText vText) {
        vText.getClass();
        this._empty_text = vText;
    }

    public final void set_hot_music(@NotNull TextView textView) {
        textView.getClass();
        this._hot_music = textView;
    }

    public final void set_recently_music(@NotNull TextView textView) {
        textView.getClass();
        this._recently_music = textView;
    }

    public final void set_recommend_music(@NotNull TextView textView) {
        textView.getClass();
        this._recommend_music = textView;
    }

    public final void set_recyclerView(@NotNull VRecyclerView vRecyclerView) {
        vRecyclerView.getClass();
        this._recyclerView = vRecyclerView;
    }

    public final void set_rootView(@NotNull KtvChooseSongPageView ktvChooseSongPageView) {
        ktvChooseSongPageView.getClass();
        this._rootView = ktvChooseSongPageView;
    }

    public final void set_searchRecyclerView(@NotNull VRecyclerView vRecyclerView) {
        vRecyclerView.getClass();
        this._searchRecyclerView = vRecyclerView;
    }

    public final void set_search_edit(@NotNull EditText editText) {
        editText.getClass();
        this._search_edit = editText;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m78237t0(@NotNull InterfaceC13123b changeTagListener) {
        changeTagListener.getClass();
        get_hot_music().setSelected(true);
        get_recommend_music().setSelected(false);
        get_recently_music().setSelected(false);
        this.changeTagListener = changeTagListener;
        bnl0.m105509E0(get_hot_music(), new View.OnClickListener() { // from class: l.q2r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KtvChooseSongPageView.m78229l0(this.f155382a, view);
            }
        });
        bnl0.m105509E0(get_recommend_music(), new View.OnClickListener() { // from class: l.r2r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KtvChooseSongPageView.m78225h0(this.f160969a, view);
            }
        });
        bnl0.m105509E0(get_recently_music(), new View.OnClickListener() { // from class: l.s2r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KtvChooseSongPageView.m78226i0(this.f165909a, view);
            }
        });
        bnl0.m105509E0(get_cancel_icon(), new View.OnClickListener() { // from class: l.t2r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KtvChooseSongPageView.m78230m0(this.f171789a, view);
            }
        });
        bnl0.m105509E0(get_cancel_bt(), new View.OnClickListener() { // from class: l.u2r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KtvChooseSongPageView.m78228k0(this.f177235a, view);
            }
        });
        get_search_edit().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.v2r
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                KtvChooseSongPageView.m78227j0(this.f182105a, view, z);
            }
        });
        get_search_edit().clearFocus();
        get_search_edit().setOnEditorActionListener(this);
        get_search_edit().addTextChangedListener(new C13124c());
    }

    /* JADX INFO: renamed from: u0 */
    public final void m78238u0(@NotNull String action, boolean isShow) {
        action.getClass();
        bnl0.m105524M(get_empty(), isShow);
        if (Intrinsics.m88377d(action, BLivePkInviteSource.query)) {
            get_empty_icon().setImageDrawable(get_empty_icon().getContext().getDrawable(obc0.f146348ga));
            get_empty_text().setText(xau.m209910t(R$string.f47535Fk));
        } else {
            get_empty_icon().setImageDrawable(get_empty_icon().getContext().getDrawable(obc0.f146089K3));
            get_empty_text().setText(xau.m209910t(R$string.f47513Ek));
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m78239v0(boolean isShow) {
        bnl0.m105524M(get_searchRecyclerView(), isShow);
        bnl0.m105524M(get_cancel_bt(), isShow);
        bnl0.m105524M(get_recyclerView(), !isShow);
        bnl0.m105524M(get_hot_music(), !isShow);
        bnl0.m105524M(get_recommend_music(), !isShow);
        bnl0.m105524M(get_recently_music(), !isShow);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public KtvChooseSongPageView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ KtvChooseSongPageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
