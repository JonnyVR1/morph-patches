package p003l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.data.Conversation;
import com.p000p1.mobile.putong.core.data.Greeting;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.member.R$string;
import com.p000p1.mobile.putong.core.p001ui.citytop.C3074a;
import com.p000p1.mobile.putong.core.p001ui.citytop.CityTopItemView;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.dac0;
import l.e30;
import l.e51;
import l.f6c0;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.vwb;
import l.x9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class l55 extends dac0<Greeting> {

    /* JADX INFO: renamed from: c */
    public final ArrayList<Greeting> f5757c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final C3074a f5758d;

    /* JADX INFO: renamed from: e */
    public Links f5759e;

    public l55(C3074a c3074a) {
        this.f5758d = c3074a;
    }

    /* JADX INFO: renamed from: C */
    public int m7683C() {
        return this.f5757c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m7684D(ViewGroup viewGroup, int i) {
        return this.f5758d.act().inflater().inflate(f6c0.r1, viewGroup, false);
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void m7682A(View view, final Greeting greeting, int i, int i2) {
        final CityTopItemView cityTopItemView = (CityTopItemView) view;
        c(this.f5758d.act(), c.combineLatest(CoreModule.c.e0.Ka(greeting.f63id), CoreModule.k.c.uiGet(greeting.messages.latestId), new x9j() { // from class: l.e55
            public final Object call(Object obj, Object obj2) {
                return vwb.Y((User) obj, (Message) obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.f55
            public final void call(Object obj) {
                this.f4388a.m7691Q(greeting, cityTopItemView, (j760) obj);
            }
        }));
        c(this.f5758d.act(), CoreModule.c.f0.Ue(greeting.f63id)).subscribe(mkd0.G(new e30() { // from class: l.g55
            public final void call(Object obj) {
                this.f4564a.m7693S(greeting, (Conversation) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public Greeting getItem(int i) {
        if (vwb.J(this.f5757c)) {
            return null;
        }
        return this.f5757c.get(i);
    }

    /* JADX INFO: renamed from: M */
    public Links m7687M() {
        return this.f5759e;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m7688N(Greeting greeting) {
        this.f5758d.m1912x0(greeting);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m7689O(Greeting greeting, Greeting greeting2) {
        this.f5758d.m1913y0(greeting);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m7690P(Greeting greeting) {
        this.f5758d.mo1914z(greeting, true);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m7691Q(final Greeting greeting, CityTopItemView cityTopItemView, j760 j760Var) {
        if (NullChecker.a(((User) j760Var.a).localRelationship) && TEnum.equals(((User) j760Var.a).localRelationship.state, "matched")) {
            e51.G(new Runnable() { // from class: l.h55
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4791a.m7688N(greeting);
                }
            });
        } else {
            cityTopItemView.m1885h((User) j760Var.a, (Message) j760Var.b, greeting, new e30() { // from class: l.i55
                public final void call(Object obj) {
                    this.f4993a.m7689O(greeting, (Greeting) obj);
                }
            }, new d30() { // from class: l.j55
                public final void call() {
                    this.f5246a.m7690P(greeting);
                }
            });
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m7692R(Greeting greeting) {
        this.f5758d.m1912x0(greeting);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m7693S(final Greeting greeting, Conversation conversation) {
        if (NullChecker.a(conversation) && TextUtils.equals(conversation.convType, "default")) {
            e51.G(new Runnable() { // from class: l.k55
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5437a.m7692R(greeting);
                }
            });
        }
    }

    /* JADX INFO: renamed from: T */
    public int m7694T() {
        return this.f5757c.size();
    }

    /* JADX INFO: renamed from: U */
    public boolean m7695U(Greeting greeting) {
        int iIndexOf = this.f5757c.contains(greeting) ? this.f5757c.indexOf(greeting) : -1;
        if (iIndexOf == -1) {
            return false;
        }
        this.f5757c.remove(greeting);
        if (this.f5757c.size() > 0) {
            notifyItemRemoved(iIndexOf);
            return true;
        }
        notifyDataSetChanged();
        return true;
    }

    /* JADX INFO: renamed from: V */
    public void m7696V(List<Greeting> list, Links links) {
        this.f5759e = links;
        this.f5757c.clear();
        if (!vwb.J(list)) {
            this.f5757c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: e */
    public void m7697e(int i) {
        super.e(i);
        if (this.f5757c.isEmpty() || i != this.f5757c.size() - 2) {
            return;
        }
        C3074a c3074a = this.f5758d;
        if (c3074a.f1108a) {
            if (Network.isConnected(c3074a.act())) {
                this.f5758d.m1909t0();
            } else {
                lsi0.w(R$string.f240F);
            }
        }
    }
}
