package com.p046p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupTag;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.view.GroupAvatarView;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VButton;
import p147v.VLinear;
import p147v.VText;
import p149l.au4;
import p149l.e30;
import p149l.lsi0;
import p149l.mkd0;
import p149l.o6j0;
import p149l.oa8;
import p149l.t100;
import p149l.tbk;
import p149l.vmk;
import p149l.vwb;
import p149l.x1c0;
import p149l.x9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class GroupSuggestItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public GroupSuggestItemView f21566a;

    /* JADX INFO: renamed from: b */
    public VLinear f21567b;

    /* JADX INFO: renamed from: c */
    public GroupAvatarView f21568c;

    /* JADX INFO: renamed from: d */
    public VLinear f21569d;

    /* JADX INFO: renamed from: e */
    public VText f21570e;

    /* JADX INFO: renamed from: f */
    public VText f21571f;

    /* JADX INFO: renamed from: g */
    public ChatGroupTags f21572g;

    /* JADX INFO: renamed from: h */
    public VButton f21573h;

    /* JADX INFO: renamed from: i */
    public ChatGroup f21574i;

    public GroupSuggestItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m36592d(View view) {
        vmk.m198951a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m36593e() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: f */
    public final SpannableStringBuilder m36594f(List<ChatGroupTag> list, int i, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<ChatGroupTag> arrayList = new ArrayList(list);
        int i2 = 0;
        if (!TextUtils.isEmpty(this.f21574i.category.name) && !this.f21574i.category.hidden) {
            ChatGroupTag chatGroupTagNew_ = ChatGroupTag.new_();
            chatGroupTagNew_.name = this.f21574i.category.name;
            arrayList.add(0, chatGroupTagNew_);
        }
        for (ChatGroupTag chatGroupTag : arrayList) {
            if (z) {
                spannableStringBuilder.append((CharSequence) "1");
                au4 au4Var = new au4(CoreModule.f17544b, chatGroupTag.name, Color.parseColor("#66000000"), 10, Color.parseColor("#08000000"), i, 5, t100.f167258g, 0.0f, 6.0f, 3.0f, 0, CoreModule.f17544b.getResources().getDimensionPixelSize(x1c0.f189046a), false);
                int i3 = i2 + 1;
                spannableStringBuilder.setSpan(au4Var, i2, i3, 33);
                i2 = i3;
            } else {
                spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m36595g(Conversation conversation) {
        m36593e().startActivity(MessagesAct.m48943i2(m36593e(), conversation.f56011id, false, false));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m36596h(ChatGroup chatGroup, String str, boolean z, View view) {
        if (TEnum.equals(chatGroup.groupApply.status, "default")) {
            return;
        }
        boolean z2 = true;
        if (TEnum.equals(chatGroup.groupApply.status, "approved")) {
            if (CoreModule.m29932K().me_().isBanned()) {
                lsi0.m151593w(R$string.f20765H0);
                return;
            } else {
                m36593e().duringCreated(CoreModule.f17545c.f19642f0.m32616Dg(chatGroup.f56011id)).filter(new oa8()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.umk
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f177262a.m36595g((Conversation) obj);
                    }
                }));
                return;
            }
        }
        if (CoreModule.m29932K().me_().isBanned()) {
            lsi0.m151593w(R$string.f20765H0);
            return;
        }
        boolean zEquals = TextUtils.equals(str, "p_search_result");
        String str2 = chatGroup.f56011id;
        if (zEquals) {
            o6j0.m162859c("e_enter_group_chat", str, o6j0.C18854a.m162878h("groupchat_id", str2), o6j0.C18854a.m162876f("is_anonymou_group", tbk.m187872s(chatGroup) ? 1 : 0), o6j0.C18854a.m162878h("which_page", z ? "search_empty" : "search_no_empty"));
        } else {
            o6j0.m162859c("e_enter_group_chat", str, o6j0.C18854a.m162878h("groupchat_id", str2), o6j0.C18854a.m162876f("is_anonymou_group", tbk.m187872s(chatGroup) ? 1 : 0));
            z2 = false;
        }
        tbk.m187873t(m36593e(), chatGroup.f56011id, "", z2 ? FirebaseAnalytics.Event.SEARCH : "suggest");
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SpannableStringBuilder m36597i(ChatGroup chatGroup, Integer num, Boolean bool) {
        return m36594f(chatGroup.tags, num.intValue(), bool.booleanValue());
    }

    /* JADX INFO: renamed from: j */
    public boolean m36598j(final String str, final ChatGroup chatGroup, final boolean z) {
        boolean z2 = this.f21574i == null || (NullChecker.m81304b(chatGroup) && !this.f21574i.f56011id.equals(chatGroup.f56011id));
        this.f21574i = chatGroup;
        if (TEnum.equals(chatGroup.groupApply.status, "default")) {
            this.f21573h.setTextColor(Color.parseColor("#d0d0d0"));
            this.f21573h.setText(R$string.f21124y);
            this.f21573h.setSelected(true);
        } else {
            boolean zEquals = TEnum.equals(chatGroup.groupApply.status, "approved");
            VButton vButton = this.f21573h;
            if (zEquals) {
                vButton.setTextColor(Color.parseColor("#ffffffff"));
                this.f21573h.setText(R$string.f20836Q);
                this.f21573h.setSelected(false);
            } else {
                vButton.setTextColor(Color.parseColor("#ffffffff"));
                this.f21573h.setText(R$string.f20732D);
                this.f21573h.setSelected(false);
            }
        }
        xdl0.m208329E0(this.f21573h, new View.OnClickListener() { // from class: l.smk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165354a.m36596h(chatGroup, str, z, view);
            }
        });
        this.f21568c.m49794d(chatGroup.avatars);
        this.f21570e.setSingleLine(true);
        this.f21570e.setText(chatGroup.name);
        boolean zM200296J = vwb.m200296J(chatGroup.tags);
        ChatGroupTags chatGroupTags = this.f21572g;
        if (zM200296J) {
            xdl0.m208344M(chatGroupTags, false);
        } else {
            xdl0.m208344M(chatGroupTags, true);
            this.f21572g.setTags(new x9j() { // from class: l.tmk
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return this.f171155a.m36597i(chatGroup, (Integer) obj, (Boolean) obj2);
                }
            });
        }
        boolean zIsEmpty = TextUtils.isEmpty(chatGroup.description);
        VText vText = this.f21571f;
        if (zIsEmpty) {
            xdl0.m208344M(vText, false);
            return z2;
        }
        xdl0.m208344M(vText, true);
        this.f21571f.setText(chatGroup.description);
        return z2;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36592d(this);
        this.f21572g.setMaxLines(1);
        this.f21570e.setTypeface(Typeface.defaultFromStyle(1));
    }

    public GroupSuggestItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GroupSuggestItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
