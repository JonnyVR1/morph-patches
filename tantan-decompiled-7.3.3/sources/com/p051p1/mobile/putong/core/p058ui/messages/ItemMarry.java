package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import java.util.List;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.ibc0;
import p153l.k8q;
import p153l.ovb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMarry extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemMarry f31970a;

    /* JADX INFO: renamed from: b */
    public ItemText f31971b;

    /* JADX INFO: renamed from: c */
    public ItemText f31972c;

    public ItemMarry(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m49486c(View view) {
        getContext().startActivity(CoreModule.m30933P().m143412i().mo180469f5(getContext()));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        boolean zIsEmpty = TextUtils.isEmpty(message.value);
        ItemText itemText = this.f31971b;
        if (zIsEmpty) {
            itemText.setText("");
        } else {
            itemText.setText(message.value);
        }
        if (!message.isMe() || !CoreModule.m30933P().m143405a().mo34487dj()) {
            bnl0.m105524M(this.f31972c, false);
        } else {
            bnl0.m105524M(this.f31972c, true);
            bnl0.m105509E0(this.f31972c, new View.OnClickListener() { // from class: l.j8q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f118802a.m49486c(view);
                }
            });
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m49487b(View view) {
        k8q.m148746a(this, view);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49487b(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f31971b.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f31972c.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(ibc0.f114051j2), (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public ItemMarry(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMarry(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
