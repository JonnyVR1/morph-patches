package com.p000p1.mobile.putong.core.p001ui.messages.model.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.model.MessageNewProfileSettingViewModel;
import com.p000p1.mobile.putong.core.p001ui.messages.model.view.MessageNewProfileSettingFunItem;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.mkd0;
import l.wsz;
import l.xdl0;
import p003l.c4g0;
import p003l.e30;
import p003l.m250;
import p028v.VLinear;
import p028v.VRelative;
import p028v.VSwitchButton;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessageNewProfileSettingFunItem extends VRelative {

    /* JADX INFO: renamed from: d */
    public MessageNewProfileSettingFunItem f2019d;

    /* JADX INFO: renamed from: e */
    public VText f2020e;

    /* JADX INFO: renamed from: f */
    public VSwitchButton f2021f;

    /* JADX INFO: renamed from: g */
    public VLinear f2022g;

    /* JADX INFO: renamed from: h */
    public VText f2023h;

    /* JADX INFO: renamed from: i */
    public ImageView f2024i;

    /* JADX INFO: renamed from: j */
    public c4g0 f2025j;

    public MessageNewProfileSettingFunItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m2656z(j760 j760Var) {
    }

    /* JADX INFO: renamed from: H */
    public final void m2657H(View view) {
        wsz.a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m2658I(String str) {
        Conversation conversationXe = CoreModule.c.f0.Xe(str);
        if (conversationXe.isTop()) {
            return true;
        }
        return CoreModule.l.g().b8() && conversationXe.isPlatinumTop() && CoreModule.P().f().ba(((DbObject) conversationXe).id) == 100;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m2659L(boolean z, Throwable th) {
        this.f2021f.setCheckedImmediatelyNoEvent(!z);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m2660M(MessageNewProfileSettingViewModel messageNewProfileSettingViewModel, User user, CompoundButton compoundButton, final boolean z) {
        mkd0.z(this.f2025j);
        this.f2025j = messageNewProfileSettingViewModel.f1773c.mo3522c(messageNewProfileSettingViewModel.f7031a, CoreModule.c.f0.vo(((DbObject) user).id, z ? 1 : -1)).subscribe((m250<? super V>) mkd0.H(new e30() { // from class: l.usz
            @Override // p003l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingFunItem.m2656z((j760) obj);
            }
        }, new e30() { // from class: l.vsz
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8405a.m2659L(z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m2661O(final MessageNewProfileSettingViewModel messageNewProfileSettingViewModel, final User user, final MessageNewProfileSettingViewModel.Type type) {
        xdl0.M(this.f2021f, false);
        xdl0.M(this.f2022g, true);
        xdl0.M(this.f2023h, false);
        xdl0.M(this.f2024i, true);
        this.f2020e.setText(type.des);
        this.f2020e.setCompoundDrawablesWithIntrinsicBounds(type.iconId, 0, 0, 0);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.ssz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                type.click.call(Pair.create(messageNewProfileSettingViewModel, user));
            }
        });
        if (type == MessageNewProfileSettingViewModel.Type.top_chat) {
            xdl0.E0(this, (View.OnClickListener) null);
            this.f2021f.setCheckedNoEvent(m2658I(((DbObject) user).id));
            this.f2021f.setEnabled(true);
            this.f2021f.setClickable(true);
            this.f2021f.setFocusable(true);
            this.f2021f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.tsz
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.f7719a.m2660M(messageNewProfileSettingViewModel, user, compoundButton, z);
                }
            });
            xdl0.M(this.f2021f, true);
            xdl0.M(this.f2022g, false);
        }
        if (type == MessageNewProfileSettingViewModel.Type.clear_chat_history || type == MessageNewProfileSettingViewModel.Type.un_match || type == MessageNewProfileSettingViewModel.Type.add_black_list) {
            xdl0.M(this.f2022g, false);
        }
        if (type == MessageNewProfileSettingViewModel.Type.chat_fire) {
            Conversation conversationXe = CoreModule.c.f0.Xe(((DbObject) user).id);
            if (NullChecker.a(conversationXe) && NullChecker.a(conversationXe.additional) && conversationXe.doubleDefault()) {
                xdl0.M(this.f2023h, true);
                if (!NullChecker.a(conversationXe.additional.chatMM)) {
                    this.f2023h.setText("已开启");
                    return;
                }
                boolean z = conversationXe.additional.chatMM.sparkSwitch;
                AppCompatTextView appCompatTextView = this.f2023h;
                if (z) {
                    appCompatTextView.setText("已开启");
                } else {
                    appCompatTextView.setText("已关闭");
                }
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2657H(this);
    }

    public MessageNewProfileSettingFunItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageNewProfileSettingFunItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
