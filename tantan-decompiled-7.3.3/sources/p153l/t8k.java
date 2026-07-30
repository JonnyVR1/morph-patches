package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGrabHatCP;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class t8k extends LiveMenuDialogHolder<l8k> {

    /* JADX INFO: renamed from: k */
    public View f172540k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f172541l;

    /* JADX INFO: renamed from: m */
    public VImage f172542m;

    /* JADX INFO: renamed from: n */
    public VFrame f172543n;

    /* JADX INFO: renamed from: o */
    public VRecyclerView f172544o;

    /* JADX INFO: renamed from: p */
    public TextView f172545p;

    /* JADX INFO: renamed from: q */
    public VLinear f172546q;

    /* JADX INFO: renamed from: r */
    public TextView f172547r;

    /* JADX INFO: renamed from: s */
    public TextView f172548s;

    /* JADX INFO: renamed from: t */
    public LiveBaseAdapter f172549t;

    public t8k(@NonNull l8k l8kVar) {
        super(yec0.f198964W8, l8kVar.act(), l8kVar);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m189662G(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m189667N(View view) {
        mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m189668O(View view) {
        ((l8k) this.f48605b).m153239d4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m189669P(View view) {
        ((l8k) this.f48605b).m153240e4();
    }

    /* JADX INFO: renamed from: L */
    public final void m189670L(View view) {
        u8k.m195063a(this, view);
    }

    /* JADX INFO: renamed from: M */
    public View m189671M(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return u8k.m195064b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m189672Q(View view) {
        ((l8k) this.f48605b).m138876w3(efv.f93823B, qa00.m175859d(560.0f), 7005, 24);
    }

    /* JADX INFO: renamed from: R */
    public void m189673R(List<BLiveVoiceGrabHatCP> list, BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zbn0(fln0.m126163b(bLiveVoiceGrabHatGame)));
        boolean zM147479J = jyb.m147479J(list);
        TextView textView = this.f172545p;
        if (zM147479J) {
            bnl0.m105524M(textView, true);
        } else {
            int i = 0;
            bnl0.m105524M(textView, false);
            while (i < list.size()) {
                BLiveVoiceGrabHatCP bLiveVoiceGrabHatCP = list.get(i);
                i++;
                final l8k l8kVar = (l8k) this.f48605b;
                Objects.requireNonNull(l8kVar);
                arrayList.add(new gcn0(bLiveVoiceGrabHatCP, i, new y20() { // from class: l.r8k
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        l8kVar.m153251r4((String) obj);
                    }
                }));
            }
        }
        this.f172549t.m68554Z(arrayList);
        m189674S(bLiveVoiceGrabHatGame);
    }

    /* JADX INFO: renamed from: S */
    public void m189674S(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        if (fln0.m126163b(bLiveVoiceGrabHatGame)) {
            m189675T(bLiveVoiceGrabHatGame);
        } else {
            m189676U(bLiveVoiceGrabHatGame);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m189675T(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        m189678W(bLiveVoiceGrabHatGame);
        m189677V(R$string.f47922Y2);
    }

    /* JADX INFO: renamed from: U */
    public final void m189676U(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        m189678W(bLiveVoiceGrabHatGame);
        m189677V(R$string.f47870Vd);
    }

    /* JADX INFO: renamed from: V */
    public void m189677V(int i) {
        this.f172548s.setText(i);
    }

    /* JADX INFO: renamed from: W */
    public final void m189678W(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        d3q d3qVar = (d3q) jyb.m147529r(this.f172549t.m68538J(), new qcj() { // from class: l.s8k
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((d3q) obj) instanceof zbn0);
            }
        });
        if (d3qVar != null) {
            zbn0 zbn0Var = (zbn0) d3qVar;
            zbn0Var.m219200I(fln0.m126163b(bLiveVoiceGrabHatGame));
            this.f172549t.m68543O(zbn0Var);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m189671M(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m189670L(view);
        this.f172549t = new LiveBaseAdapter();
        this.f172544o.setLayoutManager(new LinearLayoutManager(view.getContext()));
        this.f172544o.setAdapter(this.f172549t);
        if (!((l8k) this.f48605b).m213815L2()) {
            bnl0.m105524M(this.f172546q, false);
            bnl0.m105505C0(this.f172543n, qa00.m175859d(366.0f));
        }
        bnl0.m105509E0(this.f172541l, new View.OnClickListener() { // from class: l.m8k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                t8k.m189662G(view2);
            }
        });
        bnl0.m105509E0(this.f172540k, new View.OnClickListener() { // from class: l.n8k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f140693a.m189667N(view2);
            }
        });
        bnl0.m105509E0(this.f172547r, new View.OnClickListener() { // from class: l.o8k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f145419a.m189668O(view2);
            }
        });
        bnl0.m105509E0(this.f172548s, new View.OnClickListener() { // from class: l.p8k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f151038a.m189669P(view2);
            }
        });
        bnl0.m105509E0(this.f172542m, new View.OnClickListener() { // from class: l.q8k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f156135a.m189672Q(view2);
            }
        });
    }
}
