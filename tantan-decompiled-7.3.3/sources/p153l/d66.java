package p153l;

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
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookAct;
import com.p051p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookGroupFrag;
import com.p051p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookMatchFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class d66 implements iam<s56> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f85292a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f85293b;

    /* JADX INFO: renamed from: c */
    public ViewPager2 f85294c;

    /* JADX INFO: renamed from: d */
    public final ConversationAddressBookAct f85295d;

    /* JADX INFO: renamed from: e */
    public int f85296e = -1;

    /* JADX INFO: renamed from: f */
    public final List<View> f85297f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public List<pcj<String>> f85298g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public pcj<String> f85299h = null;

    /* JADX INFO: renamed from: i */
    public pcj<String> f85300i = null;

    /* JADX INFO: renamed from: j */
    public p56 f85301j;

    public d66(ConversationAddressBookAct conversationAddressBookAct) {
        this.f85295d = conversationAddressBookAct;
    }

    /* JADX INFO: renamed from: p */
    private void m114404p() {
        VText vText = new VText(this.f85295d);
        vText.setText(this.f85295d.getResources().getString(R$string.f19294h1));
        vText.setTextSize(21.0f);
        vText.setTextColor(this.f85295d.getResources().getColor(b9c0.f75557c));
        vText.setPadding(0, qa00.m175859d(2.0f), 0, 0);
        vText.setTypeface(null, 1);
        this.f85292a.setTitleView(vText);
        this.f85292a.setLeftIconAsBack(this.f85295d);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f85295d;
    }

    /* JADX INFO: renamed from: b */
    public View m114405b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e66.m119577b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public final void m114407d() {
        this.f85293b.removeAllViews();
        this.f85297f.clear();
        for (int i = 0; i < this.f85298g.size(); i++) {
            View viewInflate = p9r.m171370a(this.f85295d).inflate(kec0.f126075u, (ViewGroup) this.f85293b, false);
            bnl0.m105509E0(viewInflate, new View.OnClickListener() { // from class: l.c66
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f79940a.m114417s(view);
                }
            });
            if (i > 0) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewInflate.getLayoutParams();
                layoutParams.leftMargin = qa00.f156320g;
                this.f85293b.addView(viewInflate, layoutParams);
            } else {
                this.f85293b.addView(viewInflate);
            }
            this.f85297f.add(viewInflate);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m114408e() {
        return NullChecker.m82486a(this.f85299h) && NullChecker.m82486a(this.f85298g) && this.f85296e == this.f85298g.indexOf(this.f85299h);
    }

    /* JADX INFO: renamed from: f */
    public int m114409f() {
        return this.f85296e;
    }

    /* JADX INFO: renamed from: i */
    public void m114410i(Bundle bundle) {
        m114404p();
        m114414m(bundle);
        m114413l(0);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m114405b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final void m114411j(View view, int i, int i2) {
        TextView textView = (TextView) view.findViewById(adc0.f70365h3);
        bnl0.m105524M(textView, false);
        if (NullChecker.m82486a(this.f85299h) && i2 == this.f85298g.indexOf(this.f85299h) && this.f85296e != i2) {
            if (i <= 0) {
                bnl0.m105524M(textView, false);
            } else {
                bnl0.m105524M(textView, true);
                textView.setText(a9g0.m96572g(i, 99));
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m114412k(int i, int i2, Intent intent) {
        int i3 = this.f85296e;
        if (i3 < 0) {
            return;
        }
        Object obj = (pcj) this.f85298g.get(i3);
        if (NullChecker.m82486a(obj)) {
            ((PutongFrag) obj).onActivityResult(i, i2, intent);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m114413l(int i) {
        if (this.f85293b.getChildCount() < this.f85298g.size()) {
            m114407d();
        }
        for (int i2 = 0; i2 < this.f85297f.size(); i2++) {
            m114415n(i2, i);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m114414m(Bundle bundle) {
        this.f85298g = new ArrayList();
        ConversationAddressBookMatchFrag conversationAddressBookMatchFrag = new ConversationAddressBookMatchFrag();
        this.f85299h = conversationAddressBookMatchFrag;
        this.f85298g.add(conversationAddressBookMatchFrag);
        ConversationAddressBookGroupFrag conversationAddressBookGroupFrag = new ConversationAddressBookGroupFrag();
        this.f85300i = conversationAddressBookGroupFrag;
        this.f85298g.add(conversationAddressBookGroupFrag);
        this.f85301j = new p56(this.f85295d);
        this.f85294c.setUserInputEnabled(false);
        this.f85294c.setOffscreenPageLimit(-1);
        this.f85294c.setAdapter(this.f85301j);
        this.f85301j.m170611U(this.f85298g);
        if (NullChecker.m82486a(bundle) && bundle.getInt("currentIndex", -1) >= 0) {
            int i = bundle.getInt("currentIndex");
            this.f85296e = i;
            this.f85294c.m4252j(i, false);
        } else {
            if (!jyb.m147479J(this.f85298g)) {
                this.f85296e = 0;
            }
            int i2 = this.f85296e;
            if (i2 >= 0) {
                this.f85294c.m4252j(i2, false);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m114415n(int i, int i2) {
        View view = this.f85297f.get(i);
        String strCall = this.f85298g.get(i).call();
        if (strCall == null) {
            strCall = "";
        }
        TextView textView = (TextView) view.findViewById(adc0.f70124Sd);
        textView.setText(strCall);
        if (i == this.f85296e) {
            textView.setTextColor(Color.parseColor("#FFFFFF"));
            textView.setBackgroundResource(dbc0.f87169l0);
        } else {
            textView.setTextColor(Color.parseColor("#4D000000"));
            textView.setBackgroundResource(0);
        }
        m114411j(view, i2, i);
    }

    /* JADX INFO: renamed from: q */
    public void m114416q(boolean z) {
        VNavigationBar vNavigationBar = this.f85292a;
        if (vNavigationBar == null || vNavigationBar.getRightIconContainer() == null) {
            return;
        }
        this.f85292a.getRightIconContainer().setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: s */
    public final void m114417s(View view) {
        int iIndexOf = this.f85297f.indexOf(view);
        if (iIndexOf >= 0 && iIndexOf != this.f85296e) {
            int i = NullChecker.m82486a(CoreModule.f18264c.f20384f0.m33799Se()) ? CoreModule.f18264c.f20384f0.m33799Se().conversations.addressBookUnseen : 0;
            if (this.f85296e == this.f85298g.indexOf(this.f85299h)) {
                CoreModule.f18264c.f20384f0.m33615Cp(pzi0.m174454o());
                CoreModule.f18264c.f20384f0.m33941dq(uqb0.f180376H.guessedCurrentServerTime());
                bnl0.m105524M((TextView) view.findViewById(adc0.f70365h3), false);
                i = 0;
            }
            this.f85294c.m4252j(iIndexOf, false);
            this.f85296e = iIndexOf;
            m114413l(i);
            if (NullChecker.m82486a(this.f85299h) && iIndexOf == this.f85298g.indexOf(this.f85299h)) {
                i4g0.m138520r("e_contacts_matches", this.f85295d.pageId());
                CoreModule.f18264c.f20384f0.m33615Cp(pzi0.m174454o());
                CoreModule.f18264c.f20384f0.m33941dq(uqb0.f180376H.guessedCurrentServerTime());
            } else if (NullChecker.m82486a(this.f85300i) && iIndexOf == this.f85298g.indexOf(this.f85300i)) {
                i4g0.m138520r("e_contacts_groups", this.f85295d.pageId());
            }
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(s56 s56Var) {
    }
}
