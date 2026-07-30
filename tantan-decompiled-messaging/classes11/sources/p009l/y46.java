package p009l;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.viewpager2.widget.ViewPager2;
import com.p000p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookAct;
import com.p000p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookGroupFrag;
import com.p000p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookMatchFrag;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.f6c0;
import l.qib0;
import l.s7m;
import l.t0g0;
import l.t100;
import l.u4c0;
import l.v0c0;
import l.v9j;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.z46;
import l.zvf0;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class y46 implements s7m<n46> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f22879a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f22880b;

    /* JADX INFO: renamed from: c */
    public ViewPager2 f22881c;

    /* JADX INFO: renamed from: d */
    public final ConversationAddressBookAct f22882d;

    /* JADX INFO: renamed from: e */
    public int f22883e = -1;

    /* JADX INFO: renamed from: f */
    public final List<View> f22884f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public List<v9j<String>> f22885g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public v9j<String> f22886h = null;

    /* JADX INFO: renamed from: i */
    public v9j<String> f22887i = null;

    /* JADX INFO: renamed from: j */
    public k46 f22888j;

    public y46(ConversationAddressBookAct conversationAddressBookAct) {
        this.f22882d = conversationAddressBookAct;
    }

    /* JADX INFO: renamed from: p */
    private void m25185p() {
        VText vText = new VText(this.f22882d);
        vText.setText(this.f22882d.getResources().getString(R.string.h1));
        vText.setTextSize(21.0f);
        vText.setTextColor(this.f22882d.getResources().getColor(v0c0.c));
        vText.setPadding(0, t100.d(2.0f), 0, 0);
        vText.setTypeface((Typeface) null, 1);
        this.f22879a.setTitleView(vText);
        this.f22879a.setLeftIconAsBack(this.f22882d);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m25186C0() {
        return this.f22882d;
    }

    /* JADX INFO: renamed from: b */
    public View m25187b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z46.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public final void m25189d() {
        this.f22880b.removeAllViews();
        this.f22884f.clear();
        for (int i = 0; i < this.f22885g.size(); i++) {
            View viewInflate = o7r.m19649a(this.f22882d).inflate(f6c0.u, (ViewGroup) this.f22880b, false);
            xdl0.E0(viewInflate, new View.OnClickListener() { // from class: l.x46
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22426a.m25200s(view);
                }
            });
            if (i > 0) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewInflate.getLayoutParams();
                layoutParams.leftMargin = t100.g;
                this.f22880b.addView(viewInflate, layoutParams);
            } else {
                this.f22880b.addView(viewInflate);
            }
            this.f22884f.add(viewInflate);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m25190e() {
        return NullChecker.a(this.f22886h) && NullChecker.a(this.f22885g) && this.f22883e == this.f22885g.indexOf(this.f22886h);
    }

    /* JADX INFO: renamed from: f */
    public int m25191f() {
        return this.f22883e;
    }

    /* JADX INFO: renamed from: i */
    public void m25192i(Bundle bundle) {
        m25185p();
        m25197m(bundle);
        m25196l(0);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m25187b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final void m25194j(View view, int i, int i2) {
        TextView textView = (TextView) view.findViewById(u4c0.f3);
        xdl0.M(textView, false);
        if (NullChecker.a(this.f22886h) && i2 == this.f22885g.indexOf(this.f22886h) && this.f22883e != i2) {
            if (i <= 0) {
                xdl0.M(textView, false);
            } else {
                xdl0.M(textView, true);
                textView.setText(t0g0.g(i, 99));
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m25195k(int i, int i2, Intent intent) {
        int i3 = this.f22883e;
        if (i3 < 0) {
            return;
        }
        PutongFrag putongFrag = (v9j) this.f22885g.get(i3);
        if (NullChecker.a(putongFrag)) {
            putongFrag.onActivityResult(i, i2, intent);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m25196l(int i) {
        if (this.f22880b.getChildCount() < this.f22885g.size()) {
            m25189d();
        }
        for (int i2 = 0; i2 < this.f22884f.size(); i2++) {
            m25198n(i2, i);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m25197m(Bundle bundle) {
        this.f22885g = new ArrayList();
        ConversationAddressBookMatchFrag conversationAddressBookMatchFrag = new ConversationAddressBookMatchFrag();
        this.f22886h = conversationAddressBookMatchFrag;
        this.f22885g.add(conversationAddressBookMatchFrag);
        ConversationAddressBookGroupFrag conversationAddressBookGroupFrag = new ConversationAddressBookGroupFrag();
        this.f22887i = conversationAddressBookGroupFrag;
        this.f22885g.add(conversationAddressBookGroupFrag);
        this.f22888j = new k46(this.f22882d);
        this.f22881c.setUserInputEnabled(false);
        this.f22881c.setOffscreenPageLimit(-1);
        this.f22881c.setAdapter(this.f22888j);
        this.f22888j.m17289U(this.f22885g);
        if (NullChecker.a(bundle) && bundle.getInt("currentIndex", -1) >= 0) {
            int i = bundle.getInt("currentIndex");
            this.f22883e = i;
            this.f22881c.j(i, false);
        } else {
            if (!vwb.J(this.f22885g)) {
                this.f22883e = 0;
            }
            int i2 = this.f22883e;
            if (i2 >= 0) {
                this.f22881c.j(i2, false);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m25198n(int i, int i2) {
        View view = this.f22884f.get(i);
        String str = (String) this.f22885g.get(i).call();
        if (str == null) {
            str = "";
        }
        TextView textView = (TextView) view.findViewById(u4c0.Pd);
        textView.setText(str);
        if (i == this.f22883e) {
            textView.setTextColor(Color.parseColor("#FFFFFF"));
            textView.setBackgroundResource(x2c0.k0);
        } else {
            textView.setTextColor(Color.parseColor("#4D000000"));
            textView.setBackgroundResource(0);
        }
        m25194j(view, i2, i);
    }

    /* JADX INFO: renamed from: q */
    public void m25199q(boolean z) {
        VNavigationBar vNavigationBar = this.f22879a;
        if (vNavigationBar == null || vNavigationBar.getRightIconContainer() == null) {
            return;
        }
        this.f22879a.getRightIconContainer().setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: s */
    public final void m25200s(View view) {
        int iIndexOf = this.f22884f.indexOf(view);
        if (iIndexOf >= 0 && iIndexOf != this.f22883e) {
            int i = NullChecker.a(CoreModule.c.f0.Se()) ? CoreModule.c.f0.Se().conversations.addressBookUnseen : 0;
            if (this.f22883e == this.f22885g.indexOf(this.f22886h)) {
                CoreModule.c.f0.Cp(mqi0.m18550o());
                CoreModule.c.f0.dq(qib0.H.guessedCurrentServerTime());
                xdl0.M((TextView) view.findViewById(u4c0.f3), false);
                i = 0;
            }
            this.f22881c.j(iIndexOf, false);
            this.f22883e = iIndexOf;
            m25196l(i);
            if (NullChecker.a(this.f22886h) && iIndexOf == this.f22885g.indexOf(this.f22886h)) {
                zvf0.r("e_contacts_matches", this.f22882d.pageId());
                CoreModule.c.f0.Cp(mqi0.m18550o());
                CoreModule.c.f0.dq(qib0.H.guessedCurrentServerTime());
            } else if (NullChecker.a(this.f22887i) && iIndexOf == this.f22885g.indexOf(this.f22887i)) {
                zvf0.r("e_contacts_groups", this.f22882d.pageId());
            }
        }
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m25193i1(n46 n46Var) {
    }

    public void destroy() {
    }
}
