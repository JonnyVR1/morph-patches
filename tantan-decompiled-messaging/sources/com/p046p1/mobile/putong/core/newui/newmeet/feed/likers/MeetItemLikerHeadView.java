package com.p046p1.mobile.putong.core.newui.newmeet.feed.likers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.likers.MeetItemLikerHeadView;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadView;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadViewMyTabStyle;
import com.p046p1.mobile.putong.data.User;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b3c0;
import p149l.d30;
import p149l.m2y;
import p149l.xdl0;
import p149l.zz6;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b$\u0010%R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00104\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010;\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010=\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010\u0017R\"\u0010@\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010<\u001a\u0004\b@\u0010>\"\u0004\bA\u0010\u0017¨\u0006B"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/newmeet/feed/likers/MeetItemLikerHeadView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "b", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "hasSVIPPrivilege", "", "e", "(Z)V", "newLikersCount", "likersTotalCount", "Lcom/p1/mobile/putong/data/User;", "user", Constants.INAPP_DATA_TAG, "(ZIILcom/p1/mobile/putong/data/User;)V", "isMyTabStyle", "Ll/d30;", "e_meet_see_total", "f", "(ZLl/d30;)V", "", "c", "(Lcom/p1/mobile/putong/data/User;)Ljava/lang/CharSequence;", "Lcom/p1/mobile/putong/core/newui/newmeet/feed/likers/MeetItemLikerHeadDefaultView;", "a", "Lcom/p1/mobile/putong/core/newui/newmeet/feed/likers/MeetItemLikerHeadDefaultView;", "get_title_layout_default", "()Lcom/p1/mobile/putong/core/newui/newmeet/feed/likers/MeetItemLikerHeadDefaultView;", "set_title_layout_default", "(Lcom/p1/mobile/putong/core/newui/newmeet/feed/likers/MeetItemLikerHeadDefaultView;)V", "_title_layout_default", "Lcom/p1/mobile/putong/core/newui/newmeet/feed/view/MeetItemEntryHeadView;", "Lcom/p1/mobile/putong/core/newui/newmeet/feed/view/MeetItemEntryHeadView;", "get_meet_head_layout", "()Lcom/p1/mobile/putong/core/newui/newmeet/feed/view/MeetItemEntryHeadView;", "set_meet_head_layout", "(Lcom/p1/mobile/putong/core/newui/newmeet/feed/view/MeetItemEntryHeadView;)V", "_meet_head_layout", "Lcom/p1/mobile/putong/core/newui/newmeet/feed/view/MeetItemEntryHeadViewMyTabStyle;", "Lcom/p1/mobile/putong/core/newui/newmeet/feed/view/MeetItemEntryHeadViewMyTabStyle;", "get_meet_head_layout_my_tab_style", "()Lcom/p1/mobile/putong/core/newui/newmeet/feed/view/MeetItemEntryHeadViewMyTabStyle;", "set_meet_head_layout_my_tab_style", "(Lcom/p1/mobile/putong/core/newui/newmeet/feed/view/MeetItemEntryHeadViewMyTabStyle;)V", "_meet_head_layout_my_tab_style", "Z", "isInMyTabStyle", "()Z", "setInMyTabStyle", "isNewHeadStyle", "setNewHeadStyle", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class MeetItemLikerHeadView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public MeetItemLikerHeadDefaultView _title_layout_default;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public MeetItemEntryHeadView _meet_head_layout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public MeetItemEntryHeadViewMyTabStyle _meet_head_layout_my_tab_style;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean isInMyTabStyle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean isNewHeadStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeetItemLikerHeadView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.isNewHeadStyle = CoreModule.m29935P().m94656g().mo35004D9();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        layoutInflaterFrom.getClass();
        m42829b(layoutInflaterFrom, this);
    }

    /* JADX INFO: renamed from: a */
    public static void m42828a(d30 d30Var, View view) {
        d30Var.call();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final View m42829b(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM152742b = m2y.m152742b(this, inflater, parent);
        viewM152742b.getClass();
        return viewM152742b;
    }

    /* JADX INFO: renamed from: c */
    public final CharSequence m42830c(User user) {
        String strM221001r0 = zz6.m221001r0(user.location.distance);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getContext().getString(R$string.f20632b1);
        string.getClass();
        return String.format(string, Arrays.copyOf(new Object[]{strM221001r0}, 1));
    }

    /* JADX INFO: renamed from: d */
    public final void m42831d(boolean hasSVIPPrivilege, int newLikersCount, int likersTotalCount, @Nullable User user) {
        String str;
        CharSequence charSequenceM42830c;
        if (newLikersCount > 0) {
            str = "收到新喜欢 · " + zz6.m221000q0(newLikersCount);
        } else if (hasSVIPPrivilege) {
            str = "喜欢我的人 · " + zz6.m221000q0(likersTotalCount);
        } else {
            str = "解密喜欢我的 " + zz6.m221000q0(likersTotalCount) + "人";
        }
        if (hasSVIPPrivilege) {
            charSequenceM42830c = "TA喜欢了我? 右滑立即配对!";
        } else if (user == null || (charSequenceM42830c = m42830c(user)) == null) {
            charSequenceM42830c = "";
        }
        if (this.isInMyTabStyle) {
            get_meet_head_layout_my_tab_style().m42953b(str);
            xdl0.m208344M(get_title_layout_default(), false);
            xdl0.m208344M(get_meet_head_layout(), false);
            xdl0.m208344M(get_meet_head_layout_my_tab_style(), true);
            return;
        }
        if (this.isNewHeadStyle) {
            get_meet_head_layout().m42951b(Integer.valueOf(b3c0.f73012b1), str, charSequenceM42830c);
            xdl0.m208344M(get_title_layout_default(), false);
            xdl0.m208344M(get_meet_head_layout(), true);
            xdl0.m208344M(get_meet_head_layout_my_tab_style(), false);
            return;
        }
        get_title_layout_default().get_title().setText(str);
        get_title_layout_default().get_subtitle().setText(charSequenceM42830c);
        xdl0.m208344M(get_title_layout_default(), false);
        xdl0.m208344M(get_meet_head_layout(), true);
        xdl0.m208344M(get_meet_head_layout_my_tab_style(), false);
    }

    /* JADX INFO: renamed from: e */
    public final void m42832e(boolean hasSVIPPrivilege) {
        String str;
        String str2 = hasSVIPPrivilege ? "喜欢我的人" : "解密谁喜欢我";
        if (hasSVIPPrivilege) {
            str = "右滑越多, 配对越多!";
        } else {
            str = "偷偷知晓" + (zz6.m221004u0() ? "他" : "她") + "的心意, 直接配对";
        }
        if (this.isInMyTabStyle) {
            get_meet_head_layout_my_tab_style().m42953b(str2);
            xdl0.m208344M(get_title_layout_default(), false);
            xdl0.m208344M(get_meet_head_layout(), false);
            xdl0.m208344M(get_meet_head_layout_my_tab_style(), true);
            return;
        }
        if (this.isNewHeadStyle) {
            get_meet_head_layout().m42951b(Integer.valueOf(b3c0.f73012b1), str2, str);
            xdl0.m208344M(get_title_layout_default(), false);
            xdl0.m208344M(get_meet_head_layout(), true);
            xdl0.m208344M(get_meet_head_layout_my_tab_style(), false);
            return;
        }
        get_title_layout_default().get_title().setText(str2);
        get_title_layout_default().get_subtitle().setText(str);
        xdl0.m208344M(get_title_layout_default(), false);
        xdl0.m208344M(get_meet_head_layout(), true);
        xdl0.m208344M(get_meet_head_layout_my_tab_style(), false);
    }

    /* JADX INFO: renamed from: f */
    public final void m42833f(boolean isMyTabStyle, @NotNull final d30 e_meet_see_total) {
        e_meet_see_total.getClass();
        this.isInMyTabStyle = isMyTabStyle;
        if (isMyTabStyle) {
            xdl0.m208329E0(get_meet_head_layout_my_tab_style().get_more(), new View.OnClickListener() { // from class: l.l2y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MeetItemLikerHeadView.m42828a(e_meet_see_total, view);
                }
            });
        }
    }

    @NotNull
    public final MeetItemEntryHeadView get_meet_head_layout() {
        MeetItemEntryHeadView meetItemEntryHeadView = this._meet_head_layout;
        if (meetItemEntryHeadView != null) {
            return meetItemEntryHeadView;
        }
        Intrinsics.m87502r("_meet_head_layout");
        return null;
    }

    @NotNull
    public final MeetItemEntryHeadViewMyTabStyle get_meet_head_layout_my_tab_style() {
        MeetItemEntryHeadViewMyTabStyle meetItemEntryHeadViewMyTabStyle = this._meet_head_layout_my_tab_style;
        if (meetItemEntryHeadViewMyTabStyle != null) {
            return meetItemEntryHeadViewMyTabStyle;
        }
        Intrinsics.m87502r("_meet_head_layout_my_tab_style");
        return null;
    }

    @NotNull
    public final MeetItemLikerHeadDefaultView get_title_layout_default() {
        MeetItemLikerHeadDefaultView meetItemLikerHeadDefaultView = this._title_layout_default;
        if (meetItemLikerHeadDefaultView != null) {
            return meetItemLikerHeadDefaultView;
        }
        Intrinsics.m87502r("_title_layout_default");
        return null;
    }

    public final void setInMyTabStyle(boolean z) {
        this.isInMyTabStyle = z;
    }

    public final void setNewHeadStyle(boolean z) {
        this.isNewHeadStyle = z;
    }

    public final void set_meet_head_layout(@NotNull MeetItemEntryHeadView meetItemEntryHeadView) {
        meetItemEntryHeadView.getClass();
        this._meet_head_layout = meetItemEntryHeadView;
    }

    public final void set_meet_head_layout_my_tab_style(@NotNull MeetItemEntryHeadViewMyTabStyle meetItemEntryHeadViewMyTabStyle) {
        meetItemEntryHeadViewMyTabStyle.getClass();
        this._meet_head_layout_my_tab_style = meetItemEntryHeadViewMyTabStyle;
    }

    public final void set_title_layout_default(@NotNull MeetItemLikerHeadDefaultView meetItemLikerHeadDefaultView) {
        meetItemLikerHeadDefaultView.getClass();
        this._title_layout_default = meetItemLikerHeadDefaultView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MeetItemLikerHeadView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MeetItemLikerHeadView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
