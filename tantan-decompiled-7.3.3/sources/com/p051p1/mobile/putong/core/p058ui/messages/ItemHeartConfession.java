package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemHeartConfession;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VText;
import p153l.edc0;
import p153l.ibc0;
import p153l.ovb0;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
public class ItemHeartConfession extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public VText f31843a;

    /* JADX INFO: renamed from: b */
    public VText f31844b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f31845c;

    /* JADX INFO: renamed from: d */
    public User f31846d;

    public ItemHeartConfession(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m49377a(View view) {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        if (CoreModule.f18273l.m143412i().mo180296B() && CoreModule.f18273l.m143412i().mo180383Q4(message.cid)) {
            boolean zIsMe = message.isMe();
            LinearLayout linearLayout = this.f31845c;
            if (zIsMe) {
                linearLayout.setBackgroundDrawable(getResources().getDrawable(ibc0.f114055j6));
            } else {
                linearLayout.setBackgroundDrawable(getResources().getDrawable(ibc0.f114046i6));
            }
            this.f31843a.setCompoundDrawablesWithIntrinsicBounds(getContext().getResources().getDrawable(ibc0.f114037h6), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f31843a.setTextColor(Color.parseColor("#fc4717"));
            this.f31844b.setTextColor(Color.parseColor("#fc4717"));
        } else {
            boolean zIsMe2 = message.isMe();
            LinearLayout linearLayout2 = this.f31845c;
            if (zIsMe2) {
                linearLayout2.setBackgroundDrawable(getResources().getDrawable(CoreModule.f18273l.m143412i().mo180325G1() ? ibc0.f113848L6 : ibc0.f113857M6));
            } else {
                linearLayout2.setBackgroundDrawable(getResources().getDrawable(CoreModule.f18273l.m143412i().mo180325G1() ? ibc0.f113839K6 : ibc0.f113830J6));
            }
            this.f31843a.setCompoundDrawablesWithIntrinsicBounds(getContext().getResources().getDrawable(ibc0.f113866N6), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        int iM175859d = qa00.m175859d(12.0f);
        this.f31845c.setPadding(iM175859d, iM175859d, qa00.m175859d(18.0f), iM175859d);
        boolean zIsMe3 = message.isMe();
        User user = this.f31846d;
        if (zIsMe3) {
            if (NullChecker.m82486a(user) && this.f31846d.isFemale()) {
                this.f31843a.setText(R$string.f21778n2);
            } else {
                this.f31843a.setText(R$string.f21787o2);
            }
        } else if (NullChecker.m82486a(user) && this.f31846d.isFemale()) {
            this.f31843a.setText(R$string.f21760l2);
        } else {
            this.f31843a.setText(R$string.f21769m2);
        }
        this.f31844b.setText(message.value);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m49378b(String str) {
        this.f31844b.setText(str);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31843a = (VText) findViewById(edc0.f93387j1);
        this.f31844b = (VText) findViewById(edc0.f93380i1);
        this.f31845c = (LinearLayout) findViewById(edc0.f93316Z);
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.l6q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ItemHeartConfession.m49377a(view);
            }
        });
    }

    public void setLetterUser(User user) {
        this.f31846d = user;
    }

    public ItemHeartConfession(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemHeartConfession(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
