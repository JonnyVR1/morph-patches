package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.data.Message;
import java.util.List;
import p151v.VText;
import p153l.edc0;
import p153l.ovb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemChatHelperInputting extends ConstraintLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: d */
    public int f31715d;

    /* JADX INFO: renamed from: e */
    public String[] f31716e;

    /* JADX INFO: renamed from: f */
    public Runnable f31717f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public VText f31718g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemChatHelperInputting$a */
    public class RunnableC8646a implements Runnable {
        public RunnableC8646a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ItemChatHelperInputting.this.f31718g == null) {
                return;
            }
            ItemChatHelperInputting.this.f31715d %= 3;
            String str = "对方正在输入";
            if (ItemChatHelperInputting.this.f31715d < ItemChatHelperInputting.this.f31716e.length) {
                str = "对方正在输入" + ItemChatHelperInputting.this.f31716e[ItemChatHelperInputting.this.f31715d];
            }
            ItemChatHelperInputting.this.f31718g.setText(str);
            ItemChatHelperInputting.this.f31715d++;
            ItemChatHelperInputting.this.removeCallbacks(this);
            ItemChatHelperInputting.this.postDelayed(this, 300L);
        }
    }

    public ItemChatHelperInputting(Context context) {
        super(context);
        this.f31715d = 0;
        this.f31716e = new String[0];
        this.f31717f = new RunnableC8646a();
        init();
    }

    private void init() {
        this.f31716e = new String[3];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(".");
            this.f31716e[i] = sb.toString();
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(this.f31717f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f31717f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31718g = (VText) findViewById(edc0.f93255O4);
    }

    public ItemChatHelperInputting(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31715d = 0;
        this.f31716e = new String[0];
        this.f31717f = new RunnableC8646a();
        init();
    }

    public ItemChatHelperInputting(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31715d = 0;
        this.f31716e = new String[0];
        this.f31717f = new RunnableC8646a();
        init();
    }
}
