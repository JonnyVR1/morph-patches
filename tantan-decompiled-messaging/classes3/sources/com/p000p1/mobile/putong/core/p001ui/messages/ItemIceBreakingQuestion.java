package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.c3c0;
import l.e51;
import l.knb0;
import l.vwb;
import l.y4c0;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemIceBreakingQuestion extends ConstraintLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: d */
    public VText f921d;

    /* JADX INFO: renamed from: e */
    public ItemText f922e;

    /* JADX INFO: renamed from: f */
    public VText f923f;

    public ItemIceBreakingQuestion(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        CharSequence charSequenceConcat;
        if (NullChecker.a(message.additionalData) && NullChecker.a(message.additionalData.iceBreakingQuestion)) {
            this.f921d.setText(String.format("%s", message.additionalData.iceBreakingQuestion.content));
        }
        this.f922e.setText(message.value);
        Object tag = this.f923f.getTag();
        if (!(tag instanceof String)) {
            this.f923f.setText("");
            return;
        }
        User userPa = CoreModule.c.e0.Pa(message.cid);
        boolean z = userPa != null && userPa.isFemale();
        if (tag.equals("left")) {
            charSequenceConcat = (z ? "她" : "他").concat("回答了我的问题");
        } else {
            charSequenceConcat = "我回答了她的问题";
        }
        this.f923f.setText(charSequenceConcat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return vwb.f0(new knb0[]{vwb.Z(getContext().getString(R.string.c), new Runnable() { // from class: l.r4q
            @Override // java.lang.Runnable
            public final void run() {
                this.f6777a.m1290i0();
            }
        }, Integer.valueOf(c3c0.x1), (Object) null)});
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m1290i0() {
        e51.q(this.f922e.getText().toString());
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f921d = (VText) findViewById(y4c0.y3);
        this.f922e = (ItemText) findViewById(y4c0.g);
        this.f923f = (VText) findViewById(y4c0.H2);
    }

    public ItemIceBreakingQuestion(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemIceBreakingQuestion(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
