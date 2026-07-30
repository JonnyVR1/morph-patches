package p149l;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.viewpager2.widget.ViewPager2;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookAct;
import com.p046p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookGroupFrag;
import com.p046p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookMatchFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class y46 implements s7m<n46> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f195898a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f195899b;

    /* JADX INFO: renamed from: c */
    public ViewPager2 f195900c;

    /* JADX INFO: renamed from: d */
    public final ConversationAddressBookAct f195901d;

    /* JADX INFO: renamed from: e */
    public int f195902e = -1;

    /* JADX INFO: renamed from: f */
    public final List<View> f195903f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public List<v9j<String>> f195904g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public v9j<String> f195905h = null;

    /* JADX INFO: renamed from: i */
    public v9j<String> f195906i = null;

    /* JADX INFO: renamed from: j */
    public k46 f195907j;

    public y46(ConversationAddressBookAct conversationAddressBookAct) {
        this.f195901d = conversationAddressBookAct;
    }

    /* JADX INFO: renamed from: p */
    private void m212876p() {
        VText vText = new VText(this.f195901d);
        vText.setText(this.f195901d.getResources().getString(R$string.f18564h1));
        vText.setTextSize(21.0f);
        vText.setTextColor(this.f195901d.getResources().getColor(v0c0.f179096c));
        vText.setPadding(0, t100.m186890d(2.0f), 0, 0);
        vText.setTypeface(null, 1);
        this.f195898a.setTitleView(vText);
        this.f195898a.setLeftIconAsBack(this.f195901d);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f195901d;
    }

    /* JADX INFO: renamed from: b */
    public View m212877b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z46.m217063b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public final void m212879d() {
        this.f195899b.removeAllViews();
        this.f195903f.clear();
        for (int i = 0; i < this.f195904g.size(); i++) {
            View viewInflate = o7r.m163037a(this.f195901d).inflate(f6c0.f96021u, (ViewGroup) this.f195899b, false);
            xdl0.m208329E0(viewInflate, new View.OnClickListener() { // from class: l.x46
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f190942a.m212889s(view);
                }
            });
            if (i > 0) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewInflate.getLayoutParams();
                layoutParams.leftMargin = t100.f167258g;
                this.f195899b.addView(viewInflate, layoutParams);
            } else {
                this.f195899b.addView(viewInflate);
            }
            this.f195903f.add(viewInflate);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m212880e() {
        return NullChecker.m81303a(this.f195905h) && NullChecker.m81303a(this.f195904g) && this.f195902e == this.f195904g.indexOf(this.f195905h);
    }

    /* JADX INFO: renamed from: f */
    public int m212881f() {
        return this.f195902e;
    }

    /* JADX INFO: renamed from: i */
    public void m212882i(Bundle bundle) {
        m212876p();
        m212886m(bundle);
        m212885l(0);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m212877b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final void m212883j(View view, int i, int i2) {
        TextView textView = (TextView) view.findViewById(u4c0.f174240f3);
        xdl0.m208344M(textView, false);
        if (NullChecker.m81303a(this.f195905h) && i2 == this.f195904g.indexOf(this.f195905h) && this.f195902e != i2) {
            if (i <= 0) {
                xdl0.m208344M(textView, false);
            } else {
                xdl0.m208344M(textView, true);
                textView.setText(t0g0.m186866g(i, 99));
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m212884k(int i, int i2, Intent intent) {
        int i3 = this.f195902e;
        if (i3 < 0) {
            return;
        }
        Object obj = (v9j) this.f195904g.get(i3);
        if (NullChecker.m81303a(obj)) {
            ((PutongFrag) obj).onActivityResult(i, i2, intent);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m212885l(int i) {
        if (this.f195899b.getChildCount() < this.f195904g.size()) {
            m212879d();
        }
        for (int i2 = 0; i2 < this.f195903f.size(); i2++) {
            m212887n(i2, i);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m212886m(Bundle bundle) {
        this.f195904g = new ArrayList();
        ConversationAddressBookMatchFrag conversationAddressBookMatchFrag = new ConversationAddressBookMatchFrag();
        this.f195905h = conversationAddressBookMatchFrag;
        this.f195904g.add(conversationAddressBookMatchFrag);
        ConversationAddressBookGroupFrag conversationAddressBookGroupFrag = new ConversationAddressBookGroupFrag();
        this.f195906i = conversationAddressBookGroupFrag;
        this.f195904g.add(conversationAddressBookGroupFrag);
        this.f195907j = new k46(this.f195901d);
        this.f195900c.setUserInputEnabled(false);
        this.f195900c.setOffscreenPageLimit(-1);
        this.f195900c.setAdapter(this.f195907j);
        this.f195907j.m144479U(this.f195904g);
        if (NullChecker.m81303a(bundle) && bundle.getInt("currentIndex", -1) >= 0) {
            int i = bundle.getInt("currentIndex");
            this.f195902e = i;
            this.f195900c.m4250j(i, false);
        } else {
            if (!vwb.m200296J(this.f195904g)) {
                this.f195902e = 0;
            }
            int i2 = this.f195902e;
            if (i2 >= 0) {
                this.f195900c.m4250j(i2, false);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m212887n(int i, int i2) {
        View view = this.f195903f.get(i);
        String strCall = this.f195904g.get(i).call();
        if (strCall == null) {
            strCall = "";
        }
        TextView textView = (TextView) view.findViewById(u4c0.f173985Pd);
        textView.setText(strCall);
        if (i == this.f195902e) {
            textView.setTextColor(Color.parseColor("#FFFFFF"));
            textView.setBackgroundResource(x2c0.f190283k0);
        } else {
            textView.setTextColor(Color.parseColor("#4D000000"));
            textView.setBackgroundResource(0);
        }
        m212883j(view, i2, i);
    }

    /* JADX INFO: renamed from: q */
    public void m212888q(boolean z) {
        VNavigationBar vNavigationBar = this.f195898a;
        if (vNavigationBar == null || vNavigationBar.getRightIconContainer() == null) {
            return;
        }
        this.f195898a.getRightIconContainer().setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: s */
    public final void m212889s(View view) {
        int iIndexOf = this.f195903f.indexOf(view);
        if (iIndexOf >= 0 && iIndexOf != this.f195902e) {
            int i = NullChecker.m81303a(CoreModule.f17545c.f19642f0.m32796Se()) ? CoreModule.f17545c.f19642f0.m32796Se().conversations.addressBookUnseen : 0;
            if (this.f195902e == this.f195904g.indexOf(this.f195905h)) {
                CoreModule.f17545c.f19642f0.m32612Cp(mqi0.m155944o());
                CoreModule.f17545c.f19642f0.m32938dq(qib0.f154693H.guessedCurrentServerTime());
                xdl0.m208344M((TextView) view.findViewById(u4c0.f174240f3), false);
                i = 0;
            }
            this.f195900c.m4250j(iIndexOf, false);
            this.f195902e = iIndexOf;
            m212885l(i);
            if (NullChecker.m81303a(this.f195905h) && iIndexOf == this.f195904g.indexOf(this.f195905h)) {
                zvf0.m220396r("e_contacts_matches", this.f195901d.pageId());
                CoreModule.f17545c.f19642f0.m32612Cp(mqi0.m155944o());
                CoreModule.f17545c.f19642f0.m32938dq(qib0.f154693H.guessedCurrentServerTime());
            } else if (NullChecker.m81303a(this.f195906i) && iIndexOf == this.f195904g.indexOf(this.f195906i)) {
                zvf0.m220396r("e_contacts_groups", this.f195901d.pageId());
            }
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(n46 n46Var) {
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
