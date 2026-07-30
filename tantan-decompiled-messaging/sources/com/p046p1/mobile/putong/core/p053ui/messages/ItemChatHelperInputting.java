package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.data.Message;
import java.util.List;
import p147v.VText;
import p149l.knb0;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemChatHelperInputting extends ConstraintLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: d */
    public int f30867d;

    /* JADX INFO: renamed from: e */
    public String[] f30868e;

    /* JADX INFO: renamed from: f */
    public Runnable f30869f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public VText f30870g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemChatHelperInputting$a */
    public class RunnableC8483a implements Runnable {
        public RunnableC8483a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ItemChatHelperInputting.this.f30870g == null) {
                return;
            }
            ItemChatHelperInputting.this.f30867d %= 3;
            String str = "对方正在输入";
            if (ItemChatHelperInputting.this.f30867d < ItemChatHelperInputting.this.f30868e.length) {
                str = "对方正在输入" + ItemChatHelperInputting.this.f30868e[ItemChatHelperInputting.this.f30867d];
            }
            ItemChatHelperInputting.this.f30870g.setText(str);
            ItemChatHelperInputting.this.f30867d++;
            ItemChatHelperInputting.this.removeCallbacks(this);
            ItemChatHelperInputting.this.postDelayed(this, 300L);
        }
    }

    public ItemChatHelperInputting(Context context) {
        super(context);
        this.f30867d = 0;
        this.f30868e = new String[0];
        this.f30869f = new RunnableC8483a();
        init();
    }

    private void init() {
        this.f30868e = new String[3];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(".");
            this.f30868e[i] = sb.toString();
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(this.f30869f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f30869f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f30870g = (VText) findViewById(y4c0.f196020O4);
    }

    public ItemChatHelperInputting(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30867d = 0;
        this.f30868e = new String[0];
        this.f30869f = new RunnableC8483a();
        init();
    }

    public ItemChatHelperInputting(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30867d = 0;
        this.f30868e = new String[0];
        this.f30869f = new RunnableC8483a();
        init();
    }
}
