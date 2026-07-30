package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemHeartConfession;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VText;
import p149l.c3c0;
import p149l.knb0;
import p149l.t100;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemHeartConfession extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public VText f30995a;

    /* JADX INFO: renamed from: b */
    public VText f30996b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f30997c;

    /* JADX INFO: renamed from: d */
    public User f30998d;

    public ItemHeartConfession(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m48194a(View view) {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        if (CoreModule.f17554l.m94658i().mo158204B() && CoreModule.f17554l.m94658i().mo158291Q4(message.cid)) {
            boolean zIsMe = message.isMe();
            LinearLayout linearLayout = this.f30997c;
            if (zIsMe) {
                linearLayout.setBackgroundDrawable(getResources().getDrawable(c3c0.f78780j6));
            } else {
                linearLayout.setBackgroundDrawable(getResources().getDrawable(c3c0.f78771i6));
            }
            this.f30995a.setCompoundDrawablesWithIntrinsicBounds(getContext().getResources().getDrawable(c3c0.f78762h6), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f30995a.setTextColor(Color.parseColor("#fc4717"));
            this.f30996b.setTextColor(Color.parseColor("#fc4717"));
        } else {
            boolean zIsMe2 = message.isMe();
            LinearLayout linearLayout2 = this.f30997c;
            if (zIsMe2) {
                linearLayout2.setBackgroundDrawable(getResources().getDrawable(CoreModule.f17554l.m94658i().mo158233G1() ? c3c0.f78573L6 : c3c0.f78582M6));
            } else {
                linearLayout2.setBackgroundDrawable(getResources().getDrawable(CoreModule.f17554l.m94658i().mo158233G1() ? c3c0.f78564K6 : c3c0.f78555J6));
            }
            this.f30995a.setCompoundDrawablesWithIntrinsicBounds(getContext().getResources().getDrawable(c3c0.f78591N6), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        int iM186890d = t100.m186890d(12.0f);
        this.f30997c.setPadding(iM186890d, iM186890d, t100.m186890d(18.0f), iM186890d);
        boolean zIsMe3 = message.isMe();
        User user = this.f30998d;
        if (zIsMe3) {
            if (NullChecker.m81303a(user) && this.f30998d.isFemale()) {
                this.f30995a.setText(R$string.f21036n2);
            } else {
                this.f30995a.setText(R$string.f21045o2);
            }
        } else if (NullChecker.m81303a(user) && this.f30998d.isFemale()) {
            this.f30995a.setText(R$string.f21018l2);
        } else {
            this.f30995a.setText(R$string.f21027m2);
        }
        this.f30996b.setText(message.value);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m48195b(String str) {
        this.f30996b.setText(str);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f30995a = (VText) findViewById(y4c0.f196152j1);
        this.f30996b = (VText) findViewById(y4c0.f196145i1);
        this.f30997c = (LinearLayout) findViewById(y4c0.f196081Z);
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.l4q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ItemHeartConfession.m48194a(view);
            }
        });
    }

    public void setLetterUser(User user) {
        this.f30998d = user;
    }

    public ItemHeartConfession(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemHeartConfession(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
