package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.p058ui.citytop.C8462a;
import com.p051p1.mobile.putong.core.p058ui.citytop.CityTopItemView;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class m65 extends jic0<Greeting> {

    /* JADX INFO: renamed from: c */
    public final ArrayList<Greeting> f134968c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final C8462a f134969d;

    /* JADX INFO: renamed from: e */
    public Links f134970e;

    public m65(C8462a c8462a) {
        this.f134969d = c8462a;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f134968c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f134969d.act().inflater().inflate(kec0.f126026r1, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final Greeting greeting, int i, int i2) {
        final CityTopItemView cityTopItemView = (CityTopItemView) view;
        mo68557c(this.f134969d.act(), C22421c.combineLatest(CoreModule.f18264c.f20381e0.m116483Ka(greeting.f21143id), CoreModule.f18272k.f115535c.uiGet(greeting.messages.latestId), new rcj() { // from class: l.f65
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return jyb.m147494Y((User) obj, (Message) obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.g65
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102379a.m157185Q(greeting, cityTopItemView, (pf60) obj);
            }
        }));
        mo68557c(this.f134969d.act(), CoreModule.f18264c.f20384f0.m33823Ue(greeting.f21143id)).subscribe(psd0.m173596G(new y20() { // from class: l.h65
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108002a.m157187S(greeting, (Conversation) obj);
            }
        }));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public Greeting getItem(int i) {
        if (jyb.m147479J(this.f134968c)) {
            return null;
        }
        return this.f134968c.get(i);
    }

    /* JADX INFO: renamed from: M */
    public Links m157181M() {
        return this.f134970e;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m157182N(Greeting greeting) {
        this.f134969d.m45789x0(greeting);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m157183O(Greeting greeting, Greeting greeting2) {
        this.f134969d.m45790y0(greeting);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m157184P(Greeting greeting) {
        this.f134969d.mo45791z(greeting, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m157185Q(final Greeting greeting, CityTopItemView cityTopItemView, pf60 pf60Var) {
        if (NullChecker.m82486a(((User) pf60Var.f152156a).localRelationship) && TEnum.equals(((User) pf60Var.f152156a).localRelationship.state, "matched")) {
            l51.m152887G(new Runnable() { // from class: l.i65
                @Override // java.lang.Runnable
                public final void run() {
                    this.f113135a.m157182N(greeting);
                }
            });
        } else {
            cityTopItemView.m45766h((User) pf60Var.f152156a, (Message) pf60Var.f152157b, greeting, new y20() { // from class: l.j65
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f118520a.m157183O(greeting, (Greeting) obj);
                }
            }, new x20() { // from class: l.k65
                @Override // p153l.x20
                public final void call() {
                    this.f124155a.m157184P(greeting);
                }
            });
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m157186R(Greeting greeting) {
        this.f134969d.m45789x0(greeting);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m157187S(final Greeting greeting, Conversation conversation) {
        if (NullChecker.m82486a(conversation) && TextUtils.equals(conversation.convType, "default")) {
            l51.m152887G(new Runnable() { // from class: l.l65
                @Override // java.lang.Runnable
                public final void run() {
                    this.f130228a.m157186R(greeting);
                }
            });
        }
    }

    /* JADX INFO: renamed from: T */
    public int m157188T() {
        return this.f134968c.size();
    }

    /* JADX INFO: renamed from: U */
    public boolean m157189U(Greeting greeting) {
        int iIndexOf = this.f134968c.contains(greeting) ? this.f134968c.indexOf(greeting) : -1;
        if (iIndexOf == -1) {
            return false;
        }
        this.f134968c.remove(greeting);
        if (this.f134968c.size() > 0) {
            notifyItemRemoved(iIndexOf);
            return true;
        }
        notifyDataSetChanged();
        return true;
    }

    /* JADX INFO: renamed from: V */
    public void m157190V(List<Greeting> list, Links links) {
        this.f134970e = links;
        this.f134968c.clear();
        if (!jyb.m147479J(list)) {
            this.f134968c.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        super.mo48510e(i);
        if (this.f134968c.isEmpty() || i != this.f134968c.size() - 2) {
            return;
        }
        C8462a c8462a = this.f134969d;
        if (c8462a.f29562a) {
            if (Network.isConnected(c8462a.act())) {
                this.f134969d.m45786t0();
            } else {
                o1j0.m165649w(R$string.f21320F);
            }
        }
    }
}
