package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.data.Message;
import java.util.List;
import l.knb0;
import l.y4c0;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemChatHelperInputting extends ConstraintLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: d */
    public int f758d;

    /* JADX INFO: renamed from: e */
    public String[] f759e;

    /* JADX INFO: renamed from: f */
    public Runnable f760f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public VText f761g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemChatHelperInputting$a */
    public class RunnableC0066a implements Runnable {
        public RunnableC0066a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ItemChatHelperInputting.this.f761g == null) {
                return;
            }
            ItemChatHelperInputting.this.f758d %= 3;
            CharSequence charSequence = "对方正在输入";
            if (ItemChatHelperInputting.this.f758d < ItemChatHelperInputting.this.f759e.length) {
                charSequence = "对方正在输入" + ItemChatHelperInputting.this.f759e[ItemChatHelperInputting.this.f758d];
            }
            ItemChatHelperInputting.this.f761g.setText(charSequence);
            ItemChatHelperInputting.this.f758d++;
            ItemChatHelperInputting.this.removeCallbacks(this);
            ItemChatHelperInputting.this.postDelayed(this, 300L);
        }
    }

    public ItemChatHelperInputting(Context context) {
        super(context);
        this.f758d = 0;
        this.f759e = new String[0];
        this.f760f = new RunnableC0066a();
        init();
    }

    private void init() {
        this.f759e = new String[3];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(".");
            this.f759e[i] = sb.toString();
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        post(this.f760f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        removeCallbacks(this.f760f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f761g = (VText) findViewById(y4c0.O4);
    }

    public ItemChatHelperInputting(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f758d = 0;
        this.f759e = new String[0];
        this.f760f = new RunnableC0066a();
        init();
    }

    public ItemChatHelperInputting(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f758d = 0;
        this.f759e = new String[0];
        this.f760f = new RunnableC0066a();
        init();
    }
}
