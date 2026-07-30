package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VText;
import p149l.c3c0;
import p149l.e51;
import p149l.knb0;
import p149l.vwb;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemIceBreakingQuestion extends ConstraintLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: d */
    public VText f31030d;

    /* JADX INFO: renamed from: e */
    public ItemText f31031e;

    /* JADX INFO: renamed from: f */
    public VText f31032f;

    public ItemIceBreakingQuestion(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        String strConcat;
        if (NullChecker.m81303a(message.additionalData) && NullChecker.m81303a(message.additionalData.iceBreakingQuestion)) {
            this.f31030d.setText(String.format("%s", message.additionalData.iceBreakingQuestion.content));
        }
        this.f31031e.setText(message.value);
        Object tag = this.f31032f.getTag();
        if (!(tag instanceof String)) {
            this.f31032f.setText("");
            return;
        }
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(message.cid);
        boolean z = userM169430Pa != null && userM169430Pa.isFemale();
        if (tag.equals(BLiveGiftBubblePopupTitlePosition.left)) {
            strConcat = (z ? "她" : "他").concat("回答了我的问题");
        } else {
            strConcat = "我回答了她的问题";
        }
        this.f31032f.setText(strConcat);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return vwb.m200324f0(vwb.m200312Z(getContext().getString(R$string.f20934c), new Runnable() { // from class: l.r4q
            @Override // java.lang.Runnable
            public final void run() {
                this.f157715a.m48208i0();
            }
        }, Integer.valueOf(c3c0.f78901x1), null));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m48208i0() {
        e51.m114766q(this.f31031e.getText().toString());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31030d = (VText) findViewById(y4c0.f196259y3);
        this.f31031e = (ItemText) findViewById(y4c0.f196129g);
        this.f31032f = (VText) findViewById(y4c0.f195976H2);
    }

    public ItemIceBreakingQuestion(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemIceBreakingQuestion(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
