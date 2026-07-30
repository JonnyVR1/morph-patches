package com.p000p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupTag;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.messages.view.GroupAvatarView;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.lsi0;
import l.mkd0;
import l.o6j0;
import l.oa8;
import l.t100;
import l.tbk;
import l.vmk;
import l.vwb;
import l.x1c0;
import l.x9j;
import l.xdl0;
import p009l.au4;
import v.VButton;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class GroupSuggestItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public GroupSuggestItemView f344a;

    /* JADX INFO: renamed from: b */
    public VLinear f345b;

    /* JADX INFO: renamed from: c */
    public GroupAvatarView f346c;

    /* JADX INFO: renamed from: d */
    public VLinear f347d;

    /* JADX INFO: renamed from: e */
    public VText f348e;

    /* JADX INFO: renamed from: f */
    public VText f349f;

    /* JADX INFO: renamed from: g */
    public ChatGroupTags f350g;

    /* JADX INFO: renamed from: h */
    public VButton f351h;

    /* JADX INFO: renamed from: i */
    public ChatGroup f352i;

    public GroupSuggestItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m533d(View view) {
        vmk.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m534e() {
        return getContext();
    }

    /* JADX INFO: renamed from: f */
    public final SpannableStringBuilder m535f(List<ChatGroupTag> list, int i, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<ChatGroupTag> arrayList = new ArrayList(list);
        int i2 = 0;
        if (!TextUtils.isEmpty(this.f352i.category.name) && !this.f352i.category.hidden) {
            ChatGroupTag chatGroupTagNew_ = ChatGroupTag.new_();
            chatGroupTagNew_.name = this.f352i.category.name;
            arrayList.add(0, chatGroupTagNew_);
        }
        for (ChatGroupTag chatGroupTag : arrayList) {
            if (z) {
                spannableStringBuilder.append((CharSequence) "1");
                au4 au4Var = new au4(CoreModule.b, chatGroupTag.name, Color.parseColor("#66000000"), 10, Color.parseColor("#08000000"), i, 5, t100.g, 0.0f, 6.0f, 3.0f, 0, CoreModule.b.getResources().getDimensionPixelSize(x1c0.a), false);
                int i3 = i2 + 1;
                spannableStringBuilder.setSpan(au4Var, i2, i3, 33);
                i2 = i3;
            } else {
                spannableStringBuilder.append((CharSequence) " ");
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m536g(Conversation conversation) {
        m534e().startActivity(MessagesAct.i2(m534e(), ((DbObject) conversation).id, false, false));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m537h(ChatGroup chatGroup, String str, boolean z, View view) {
        if (TEnum.equals(chatGroup.groupApply.status, "default")) {
            return;
        }
        boolean z2 = true;
        if (TEnum.equals(chatGroup.groupApply.status, "approved")) {
            if (CoreModule.K().me_().isBanned()) {
                lsi0.w(R.string.H0);
                return;
            } else {
                m534e().duringCreated(CoreModule.c.f0.Dg(((DbObject) chatGroup).id)).filter(new oa8()).take(1).subscribe(mkd0.G(new e30() { // from class: l.umk
                    public final void call(Object obj) {
                        this.f21252a.m536g((Conversation) obj);
                    }
                }));
                return;
            }
        }
        if (CoreModule.K().me_().isBanned()) {
            lsi0.w(R.string.H0);
            return;
        }
        boolean zEquals = TextUtils.equals(str, "p_search_result");
        String str2 = ((DbObject) chatGroup).id;
        if (zEquals) {
            o6j0.c("e_enter_group_chat", str, new o6j0.a[]{o6j0.a.h("groupchat_id", str2), o6j0.a.f("is_anonymou_group", tbk.s(chatGroup) ? 1 : 0), o6j0.a.h("which_page", z ? "search_empty" : "search_no_empty")});
        } else {
            o6j0.c("e_enter_group_chat", str, new o6j0.a[]{o6j0.a.h("groupchat_id", str2), o6j0.a.f("is_anonymou_group", tbk.s(chatGroup) ? 1 : 0)});
            z2 = false;
        }
        tbk.t(m534e(), ((DbObject) chatGroup).id, "", z2 ? "search" : "suggest");
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SpannableStringBuilder m538i(ChatGroup chatGroup, Integer num, Boolean bool) {
        return m535f(chatGroup.tags, num.intValue(), bool.booleanValue());
    }

    /* JADX INFO: renamed from: j */
    public boolean m539j(final String str, final ChatGroup chatGroup, final boolean z) {
        boolean z2 = this.f352i == null || (NullChecker.b(chatGroup) && !((DbObject) this.f352i).id.equals(((DbObject) chatGroup).id));
        this.f352i = chatGroup;
        if (TEnum.equals(chatGroup.groupApply.status, "default")) {
            this.f351h.setTextColor(Color.parseColor("#d0d0d0"));
            this.f351h.setText(R.string.y);
            this.f351h.setSelected(true);
        } else {
            boolean zEquals = TEnum.equals(chatGroup.groupApply.status, "approved");
            VButton vButton = this.f351h;
            if (zEquals) {
                vButton.setTextColor(Color.parseColor("#ffffffff"));
                this.f351h.setText(R.string.Q);
                this.f351h.setSelected(false);
            } else {
                vButton.setTextColor(Color.parseColor("#ffffffff"));
                this.f351h.setText(R.string.D);
                this.f351h.setSelected(false);
            }
        }
        xdl0.E0(this.f351h, new View.OnClickListener() { // from class: l.smk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20365a.m537h(chatGroup, str, z, view);
            }
        });
        this.f346c.d(chatGroup.avatars);
        this.f348e.setSingleLine(true);
        this.f348e.setText(chatGroup.name);
        boolean zJ = vwb.J(chatGroup.tags);
        VText vText = this.f350g;
        if (zJ) {
            xdl0.M(vText, false);
        } else {
            xdl0.M(vText, true);
            this.f350g.setTags(new x9j() { // from class: l.tmk
                public final Object call(Object obj, Object obj2) {
                    return this.f20772a.m538i(chatGroup, (Integer) obj, (Boolean) obj2);
                }
            });
        }
        boolean zIsEmpty = TextUtils.isEmpty(chatGroup.description);
        VText vText2 = this.f349f;
        if (zIsEmpty) {
            xdl0.M(vText2, false);
            return z2;
        }
        xdl0.M(vText2, true);
        this.f349f.setText(chatGroup.description);
        return z2;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m533d(this);
        this.f350g.setMaxLines(1);
        this.f348e.setTypeface(Typeface.defaultFromStyle(1));
    }

    public GroupSuggestItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GroupSuggestItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
