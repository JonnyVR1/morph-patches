package com.p046p1.mobile.putong.core.p053ui.messages.model.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.p053ui.messages.model.MessageNewProfileSettingViewModel;
import com.p046p1.mobile.putong.core.p053ui.messages.model.view.MessageNewProfileSettingFunItem;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VSwitchButton;
import p147v.VText;
import p149l.c4g0;
import p149l.e30;
import p149l.j760;
import p149l.mkd0;
import p149l.wsz;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class MessageNewProfileSettingFunItem extends VRelative {

    /* JADX INFO: renamed from: d */
    public MessageNewProfileSettingFunItem f32128d;

    /* JADX INFO: renamed from: e */
    public VText f32129e;

    /* JADX INFO: renamed from: f */
    public VSwitchButton f32130f;

    /* JADX INFO: renamed from: g */
    public VLinear f32131g;

    /* JADX INFO: renamed from: h */
    public VText f32132h;

    /* JADX INFO: renamed from: i */
    public ImageView f32133i;

    /* JADX INFO: renamed from: j */
    public c4g0 f32134j;

    public MessageNewProfileSettingFunItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m49509z(j760 j760Var) {
    }

    /* JADX INFO: renamed from: H */
    public final void m49510H(View view) {
        wsz.m205530a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m49511I(String str) {
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(str);
        if (conversationM32856Xe.isTop()) {
            return true;
        }
        return CoreModule.f17554l.m94656g().mo35048b8() && conversationM32856Xe.isPlatinumTop() && CoreModule.m29935P().m94655f().mo36021ba(conversationM32856Xe.f56011id) == 100;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m49512L(boolean z, Throwable th) {
        this.f32130f.setCheckedImmediatelyNoEvent(!z);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m49513M(MessageNewProfileSettingViewModel messageNewProfileSettingViewModel, User user, CompoundButton compoundButton, final boolean z) {
        mkd0.m154992z(this.f32134j);
        this.f32134j = messageNewProfileSettingViewModel.f31882c.mo67374c(messageNewProfileSettingViewModel.f160469a, CoreModule.f17545c.f19642f0.m33165vo(user.f56011id, z ? 1 : -1)).subscribe(mkd0.m154956H(new e30() { // from class: l.usz
            @Override // p149l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingFunItem.m49509z((j760) obj);
            }
        }, new e30() { // from class: l.vsz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182894a.m49512L(z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m49514O(final MessageNewProfileSettingViewModel messageNewProfileSettingViewModel, final User user, final MessageNewProfileSettingViewModel.Type type) {
        xdl0.m208344M(this.f32130f, false);
        xdl0.m208344M(this.f32131g, true);
        xdl0.m208344M(this.f32132h, false);
        xdl0.m208344M(this.f32133i, true);
        this.f32129e.setText(type.des);
        this.f32129e.setCompoundDrawablesWithIntrinsicBounds(type.iconId, 0, 0, 0);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.ssz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                type.click.call(Pair.create(messageNewProfileSettingViewModel, user));
            }
        });
        if (type == MessageNewProfileSettingViewModel.Type.top_chat) {
            xdl0.m208329E0(this, null);
            this.f32130f.setCheckedNoEvent(m49511I(user.f56011id));
            this.f32130f.setEnabled(true);
            this.f32130f.setClickable(true);
            this.f32130f.setFocusable(true);
            this.f32130f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.tsz
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.f171977a.m49513M(messageNewProfileSettingViewModel, user, compoundButton, z);
                }
            });
            xdl0.m208344M(this.f32130f, true);
            xdl0.m208344M(this.f32131g, false);
        }
        if (type == MessageNewProfileSettingViewModel.Type.clear_chat_history || type == MessageNewProfileSettingViewModel.Type.un_match || type == MessageNewProfileSettingViewModel.Type.add_black_list) {
            xdl0.m208344M(this.f32131g, false);
        }
        if (type == MessageNewProfileSettingViewModel.Type.chat_fire) {
            Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(user.f56011id);
            if (NullChecker.m81303a(conversationM32856Xe) && NullChecker.m81303a(conversationM32856Xe.additional) && conversationM32856Xe.doubleDefault()) {
                xdl0.m208344M(this.f32132h, true);
                if (!NullChecker.m81303a(conversationM32856Xe.additional.chatMM)) {
                    this.f32132h.setText("已开启");
                    return;
                }
                boolean z = conversationM32856Xe.additional.chatMM.sparkSwitch;
                VText vText = this.f32132h;
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
        m49510H(this);
    }

    public MessageNewProfileSettingFunItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageNewProfileSettingFunItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
