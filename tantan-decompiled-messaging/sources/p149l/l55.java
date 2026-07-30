package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.p053ui.citytop.C8299a;
import com.p046p1.mobile.putong.core.p053ui.citytop.CityTopItemView;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes10.dex */
public class l55 extends dac0<Greeting> {

    /* JADX INFO: renamed from: c */
    public final ArrayList<Greeting> f126082c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final C8299a f126083d;

    /* JADX INFO: renamed from: e */
    public Links f126084e;

    public l55(C8299a c8299a) {
        this.f126083d = c8299a;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f126082c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f126083d.act().inflater().inflate(f6c0.f95972r1, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final Greeting greeting, int i, int i2) {
        final CityTopItemView cityTopItemView = (CityTopItemView) view;
        mo67374c(this.f126083d.act(), C22306c.combineLatest(CoreModule.f17545c.f19639e0.m169410Ka(greeting.f20401id), CoreModule.f17553k.f91940c.uiGet(greeting.messages.latestId), new x9j() { // from class: l.e55
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return vwb.m200311Y((User) obj, (Message) obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.f55
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94958a.m148513Q(greeting, cityTopItemView, (j760) obj);
            }
        }));
        mo67374c(this.f126083d.act(), CoreModule.f17545c.f19642f0.m32820Ue(greeting.f20401id)).subscribe(mkd0.m154955G(new e30() { // from class: l.g55
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100621a.m148515S(greeting, (Conversation) obj);
            }
        }));
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public Greeting getItem(int i) {
        if (vwb.m200296J(this.f126082c)) {
            return null;
        }
        return this.f126082c.get(i);
    }

    /* JADX INFO: renamed from: M */
    public Links m148509M() {
        return this.f126084e;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m148510N(Greeting greeting) {
        this.f126083d.m44606x0(greeting);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m148511O(Greeting greeting, Greeting greeting2) {
        this.f126083d.m44607y0(greeting);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m148512P(Greeting greeting) {
        this.f126083d.mo44608z(greeting, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m148513Q(final Greeting greeting, CityTopItemView cityTopItemView, j760 j760Var) {
        if (NullChecker.m81303a(((User) j760Var.f116564a).localRelationship) && TEnum.equals(((User) j760Var.f116564a).localRelationship.state, "matched")) {
            e51.m114742G(new Runnable() { // from class: l.h55
                @Override // java.lang.Runnable
                public final void run() {
                    this.f105924a.m148510N(greeting);
                }
            });
        } else {
            cityTopItemView.m44583h((User) j760Var.f116564a, (Message) j760Var.f116565b, greeting, new e30() { // from class: l.i55
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f111525a.m148511O(greeting, (Greeting) obj);
                }
            }, new d30() { // from class: l.j55
                @Override // p149l.d30
                public final void call() {
                    this.f116268a.m148512P(greeting);
                }
            });
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m148514R(Greeting greeting) {
        this.f126083d.m44606x0(greeting);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m148515S(final Greeting greeting, Conversation conversation) {
        if (NullChecker.m81303a(conversation) && TextUtils.equals(conversation.convType, "default")) {
            e51.m114742G(new Runnable() { // from class: l.k55
                @Override // java.lang.Runnable
                public final void run() {
                    this.f121143a.m148514R(greeting);
                }
            });
        }
    }

    /* JADX INFO: renamed from: T */
    public int m148516T() {
        return this.f126082c.size();
    }

    /* JADX INFO: renamed from: U */
    public boolean m148517U(Greeting greeting) {
        int iIndexOf = this.f126082c.contains(greeting) ? this.f126082c.indexOf(greeting) : -1;
        if (iIndexOf == -1) {
            return false;
        }
        this.f126082c.remove(greeting);
        if (this.f126082c.size() > 0) {
            notifyItemRemoved(iIndexOf);
            return true;
        }
        notifyDataSetChanged();
        return true;
    }

    /* JADX INFO: renamed from: V */
    public void m148518V(List<Greeting> list, Links links) {
        this.f126084e = links;
        this.f126082c.clear();
        if (!vwb.m200296J(list)) {
            this.f126082c.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        super.mo47327e(i);
        if (this.f126082c.isEmpty() || i != this.f126082c.size() - 2) {
            return;
        }
        C8299a c8299a = this.f126083d;
        if (c8299a.f28714a) {
            if (Network.isConnected(c8299a.act())) {
                this.f126083d.m44603t0();
            } else {
                lsi0.m151593w(R$string.f20578F);
            }
        }
    }
}
