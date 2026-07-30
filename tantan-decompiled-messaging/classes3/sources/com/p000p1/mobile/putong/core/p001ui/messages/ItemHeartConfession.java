package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemHeartConfession;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.c3c0;
import l.knb0;
import l.t100;
import l.y4c0;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemHeartConfession extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public VText f886a;

    /* JADX INFO: renamed from: b */
    public VText f887b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f888c;

    /* JADX INFO: renamed from: d */
    public User f889d;

    public ItemHeartConfession(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m1274a(View view) {
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        if (CoreModule.l.i().B() && CoreModule.l.i().Q4(message.cid)) {
            boolean zIsMe = message.isMe();
            LinearLayout linearLayout = this.f888c;
            if (zIsMe) {
                linearLayout.setBackgroundDrawable(getResources().getDrawable(c3c0.j6));
            } else {
                linearLayout.setBackgroundDrawable(getResources().getDrawable(c3c0.i6));
            }
            this.f886a.setCompoundDrawablesWithIntrinsicBounds(getContext().getResources().getDrawable(c3c0.h6), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f886a.setTextColor(Color.parseColor("#fc4717"));
            this.f887b.setTextColor(Color.parseColor("#fc4717"));
        } else {
            boolean zIsMe2 = message.isMe();
            LinearLayout linearLayout2 = this.f888c;
            if (zIsMe2) {
                linearLayout2.setBackgroundDrawable(getResources().getDrawable(CoreModule.l.i().G1() ? c3c0.L6 : c3c0.M6));
            } else {
                linearLayout2.setBackgroundDrawable(getResources().getDrawable(CoreModule.l.i().G1() ? c3c0.K6 : c3c0.J6));
            }
            this.f886a.setCompoundDrawablesWithIntrinsicBounds(getContext().getResources().getDrawable(c3c0.N6), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        int iD = t100.d(12.0f);
        this.f888c.setPadding(iD, iD, t100.d(18.0f), iD);
        boolean zIsMe3 = message.isMe();
        User user = this.f889d;
        if (zIsMe3) {
            if (NullChecker.a(user) && this.f889d.isFemale()) {
                this.f886a.setText(R.string.n2);
            } else {
                this.f886a.setText(R.string.o2);
            }
        } else if (NullChecker.a(user) && this.f889d.isFemale()) {
            this.f886a.setText(R.string.l2);
        } else {
            this.f886a.setText(R.string.m2);
        }
        this.f887b.setText(message.value);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m1275b(String str) {
        this.f887b.setText(str);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f886a = (VText) findViewById(y4c0.j1);
        this.f887b = (VText) findViewById(y4c0.i1);
        this.f888c = (LinearLayout) findViewById(y4c0.Z);
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.l4q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ItemHeartConfession.m1274a(view);
            }
        });
    }

    public void setLetterUser(User user) {
        this.f889d = user;
    }

    public ItemHeartConfession(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemHeartConfession(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
