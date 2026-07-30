package com.p051p1.mobile.putong.core.p058ui.messages.model.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.p058ui.messages.model.MessageNewProfileSettingViewModel;
import com.p051p1.mobile.putong.core.p058ui.messages.model.view.MessageNewProfileSettingFunItem;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VSwitchButton;
import p151v.VText;
import p153l.bnl0;
import p153l.kcg0;
import p153l.pf60;
import p153l.psd0;
import p153l.t100;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class MessageNewProfileSettingFunItem extends VRelative {

    /* JADX INFO: renamed from: d */
    public MessageNewProfileSettingFunItem f32976d;

    /* JADX INFO: renamed from: e */
    public VText f32977e;

    /* JADX INFO: renamed from: f */
    public VSwitchButton f32978f;

    /* JADX INFO: renamed from: g */
    public VLinear f32979g;

    /* JADX INFO: renamed from: h */
    public VText f32980h;

    /* JADX INFO: renamed from: i */
    public ImageView f32981i;

    /* JADX INFO: renamed from: j */
    public kcg0 f32982j;

    public MessageNewProfileSettingFunItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m50692z(pf60 pf60Var) {
    }

    /* JADX INFO: renamed from: H */
    public final void m50693H(View view) {
        t100.m188828a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m50694I(String str) {
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(str);
        if (conversationM33859Xe.isTop()) {
            return true;
        }
        return CoreModule.f18273l.m143410g().mo36051b8() && conversationM33859Xe.isPlatinumTop() && CoreModule.m30933P().m143409f().mo37024ba(conversationM33859Xe.f56859id) == 100;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m50695L(boolean z, Throwable th) {
        this.f32978f.setCheckedImmediatelyNoEvent(!z);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m50696M(MessageNewProfileSettingViewModel messageNewProfileSettingViewModel, User user, CompoundButton compoundButton, final boolean z) {
        psd0.m173633z(this.f32982j);
        this.f32982j = messageNewProfileSettingViewModel.f32730c.mo68557c(messageNewProfileSettingViewModel.f116326a, CoreModule.f18264c.f20384f0.m34168vo(user.f56859id, z ? 1 : -1)).subscribe(psd0.m173597H(new y20() { // from class: l.r100
            @Override // p153l.y20
            public final void call(Object obj) {
                MessageNewProfileSettingFunItem.m50692z((pf60) obj);
            }
        }, new y20() { // from class: l.s100
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165750a.m50695L(z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m50697O(final MessageNewProfileSettingViewModel messageNewProfileSettingViewModel, final User user, final MessageNewProfileSettingViewModel.Type type) {
        bnl0.m105524M(this.f32978f, false);
        bnl0.m105524M(this.f32979g, true);
        bnl0.m105524M(this.f32980h, false);
        bnl0.m105524M(this.f32981i, true);
        this.f32977e.setText(type.des);
        this.f32977e.setCompoundDrawablesWithIntrinsicBounds(type.iconId, 0, 0, 0);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.p100
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                type.click.call(Pair.create(messageNewProfileSettingViewModel, user));
            }
        });
        if (type == MessageNewProfileSettingViewModel.Type.top_chat) {
            bnl0.m105509E0(this, null);
            this.f32978f.setCheckedNoEvent(m50694I(user.f56859id));
            this.f32978f.setEnabled(true);
            this.f32978f.setClickable(true);
            this.f32978f.setFocusable(true);
            this.f32978f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.q100
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.f155136a.m50696M(messageNewProfileSettingViewModel, user, compoundButton, z);
                }
            });
            bnl0.m105524M(this.f32978f, true);
            bnl0.m105524M(this.f32979g, false);
        }
        if (type == MessageNewProfileSettingViewModel.Type.clear_chat_history || type == MessageNewProfileSettingViewModel.Type.un_match || type == MessageNewProfileSettingViewModel.Type.add_black_list) {
            bnl0.m105524M(this.f32979g, false);
        }
        if (type == MessageNewProfileSettingViewModel.Type.chat_fire) {
            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(user.f56859id);
            if (NullChecker.m82486a(conversationM33859Xe) && NullChecker.m82486a(conversationM33859Xe.additional) && conversationM33859Xe.doubleDefault()) {
                bnl0.m105524M(this.f32980h, true);
                if (!NullChecker.m82486a(conversationM33859Xe.additional.chatMM)) {
                    this.f32980h.setText("已开启");
                    return;
                }
                boolean z = conversationM33859Xe.additional.chatMM.sparkSwitch;
                VText vText = this.f32980h;
                if (z) {
                    vText.setText("已开启");
                } else {
                    vText.setText("已关闭");
                }
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50693H(this);
    }

    public MessageNewProfileSettingFunItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageNewProfileSettingFunItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
