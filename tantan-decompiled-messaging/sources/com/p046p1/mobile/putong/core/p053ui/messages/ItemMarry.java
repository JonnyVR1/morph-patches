package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import java.util.List;
import p149l.a1c0;
import p149l.c3c0;
import p149l.k6q;
import p149l.knb0;
import p149l.ura;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMarry extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemMarry f31122a;

    /* JADX INFO: renamed from: b */
    public ItemText f31123b;

    /* JADX INFO: renamed from: c */
    public ItemText f31124c;

    public ItemMarry(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m48303c(View view) {
        getContext().startActivity(CoreModule.m29935P().m94658i().mo158377f5(getContext()));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        boolean zIsEmpty = TextUtils.isEmpty(message.value);
        ItemText itemText = this.f31123b;
        if (zIsEmpty) {
            itemText.setText("");
        } else {
            itemText.setText(message.value);
        }
        if (!message.isMe() || !CoreModule.m29935P().m94651a().mo33484dj()) {
            xdl0.m208344M(this.f31124c, false);
        } else {
            xdl0.m208344M(this.f31124c, true);
            xdl0.m208329E0(this.f31124c, new View.OnClickListener() { // from class: l.j6q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f116492a.m48303c(view);
                }
            });
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m48304b(View view) {
        k6q.m144629a(this, view);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48304b(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31123b.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31124c.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(c3c0.f78776j2), (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public ItemMarry(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMarry(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
