package com.p051p1.mobile.putong.core.newui.group;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupTag;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.view.GroupAvatarView;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VButton;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.eac0;
import p153l.jek;
import p153l.jyb;
import p153l.lpk;
import p153l.o1j0;
import p153l.psd0;
import p153l.qa00;
import p153l.rcj;
import p153l.sb8;
import p153l.sfj0;
import p153l.y20;
import p153l.zu4;

/* JADX INFO: loaded from: classes11.dex */
public class GroupSuggestItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public GroupSuggestItemView f22308a;

    /* JADX INFO: renamed from: b */
    public VLinear f22309b;

    /* JADX INFO: renamed from: c */
    public GroupAvatarView f22310c;

    /* JADX INFO: renamed from: d */
    public VLinear f22311d;

    /* JADX INFO: renamed from: e */
    public VText f22312e;

    /* JADX INFO: renamed from: f */
    public VText f22313f;

    /* JADX INFO: renamed from: g */
    public ChatGroupTags f22314g;

    /* JADX INFO: renamed from: h */
    public VButton f22315h;

    /* JADX INFO: renamed from: i */
    public ChatGroup f22316i;

    public GroupSuggestItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m37595d(View view) {
        lpk.m155255a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m37596e() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: f */
    public final SpannableStringBuilder m37597f(List<ChatGroupTag> list, int i, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<ChatGroupTag> arrayList = new ArrayList(list);
        int i2 = 0;
        if (!TextUtils.isEmpty(this.f22316i.category.name) && !this.f22316i.category.hidden) {
            ChatGroupTag chatGroupTagNew_ = ChatGroupTag.new_();
            chatGroupTagNew_.name = this.f22316i.category.name;
            arrayList.add(0, chatGroupTagNew_);
        }
        for (ChatGroupTag chatGroupTag : arrayList) {
            if (z) {
                spannableStringBuilder.append((CharSequence) "1");
                zu4 zu4Var = new zu4(CoreModule.f18263b, chatGroupTag.name, Color.parseColor("#66000000"), 10, Color.parseColor("#08000000"), i, 5, qa00.f156320g, 0.0f, 6.0f, 3.0f, 0, CoreModule.f18263b.getResources().getDimensionPixelSize(eac0.f92753a), false);
                int i3 = i2 + 1;
                spannableStringBuilder.setSpan(zu4Var, i2, i3, 33);
                i2 = i3;
            } else {
                spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m37598g(Conversation conversation) {
        m37596e().startActivity(MessagesAct.m50126k2(m37596e(), conversation.f56859id, false, false));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m37599h(ChatGroup chatGroup, String str, boolean z, View view) {
        if (TEnum.equals(chatGroup.groupApply.status, "default")) {
            return;
        }
        boolean z2 = true;
        if (TEnum.equals(chatGroup.groupApply.status, "approved")) {
            if (CoreModule.m30930K().me_().isBanned()) {
                o1j0.m165649w(R$string.f21507H0);
                return;
            } else {
                m37596e().duringCreated(CoreModule.f18264c.f20384f0.m33619Dg(chatGroup.f56859id)).filter(new sb8()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.kpk
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f127895a.m37598g((Conversation) obj);
                    }
                }));
                return;
            }
        }
        if (CoreModule.m30930K().me_().isBanned()) {
            o1j0.m165649w(R$string.f21507H0);
            return;
        }
        boolean zEquals = TextUtils.equals(str, "p_search_result");
        String str2 = chatGroup.f56859id;
        if (zEquals) {
            sfj0.m185596c("e_enter_group_chat", str, sfj0.C20032a.m185615h("groupchat_id", str2), sfj0.C20032a.m185613f("is_anonymou_group", jek.m144587s(chatGroup) ? 1 : 0), sfj0.C20032a.m185615h("which_page", z ? "search_empty" : "search_no_empty"));
        } else {
            sfj0.m185596c("e_enter_group_chat", str, sfj0.C20032a.m185615h("groupchat_id", str2), sfj0.C20032a.m185613f("is_anonymou_group", jek.m144587s(chatGroup) ? 1 : 0));
            z2 = false;
        }
        jek.m144588t(m37596e(), chatGroup.f56859id, "", z2 ? FirebaseAnalytics.Event.SEARCH : "suggest");
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SpannableStringBuilder m37600i(ChatGroup chatGroup, Integer num, Boolean bool) {
        return m37597f(chatGroup.tags, num.intValue(), bool.booleanValue());
    }

    /* JADX INFO: renamed from: j */
    public boolean m37601j(final String str, final ChatGroup chatGroup, final boolean z) {
        boolean z2 = this.f22316i == null || (NullChecker.m82487b(chatGroup) && !this.f22316i.f56859id.equals(chatGroup.f56859id));
        this.f22316i = chatGroup;
        if (TEnum.equals(chatGroup.groupApply.status, "default")) {
            this.f22315h.setTextColor(Color.parseColor("#d0d0d0"));
            this.f22315h.setText(R$string.f21866y);
            this.f22315h.setSelected(true);
        } else {
            boolean zEquals = TEnum.equals(chatGroup.groupApply.status, "approved");
            VButton vButton = this.f22315h;
            if (zEquals) {
                vButton.setTextColor(Color.parseColor("#ffffffff"));
                this.f22315h.setText(R$string.f21578Q);
                this.f22315h.setSelected(false);
            } else {
                vButton.setTextColor(Color.parseColor("#ffffffff"));
                this.f22315h.setText(R$string.f21474D);
                this.f22315h.setSelected(false);
            }
        }
        bnl0.m105509E0(this.f22315h, new View.OnClickListener() { // from class: l.ipk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116285a.m37599h(chatGroup, str, z, view);
            }
        });
        this.f22310c.m50977d(chatGroup.avatars);
        this.f22312e.setSingleLine(true);
        this.f22312e.setText(chatGroup.name);
        boolean zM147479J = jyb.m147479J(chatGroup.tags);
        ChatGroupTags chatGroupTags = this.f22314g;
        if (zM147479J) {
            bnl0.m105524M(chatGroupTags, false);
        } else {
            bnl0.m105524M(chatGroupTags, true);
            this.f22314g.setTags(new rcj() { // from class: l.jpk
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return this.f122115a.m37600i(chatGroup, (Integer) obj, (Boolean) obj2);
                }
            });
        }
        boolean zIsEmpty = TextUtils.isEmpty(chatGroup.description);
        VText vText = this.f22313f;
        if (zIsEmpty) {
            bnl0.m105524M(vText, false);
            return z2;
        }
        bnl0.m105524M(vText, true);
        this.f22313f.setText(chatGroup.description);
        return z2;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37595d(this);
        this.f22314g.setMaxLines(1);
        this.f22312e.setTypeface(Typeface.defaultFromStyle(1));
    }

    public GroupSuggestItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GroupSuggestItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
