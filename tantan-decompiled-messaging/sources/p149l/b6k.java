package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGrabHatCP;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class b6k extends LiveMenuDialogHolder<t5k> {

    /* JADX INFO: renamed from: k */
    public View f73829k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f73830l;

    /* JADX INFO: renamed from: m */
    public VImage f73831m;

    /* JADX INFO: renamed from: n */
    public VFrame f73832n;

    /* JADX INFO: renamed from: o */
    public VRecyclerView f73833o;

    /* JADX INFO: renamed from: p */
    public TextView f73834p;

    /* JADX INFO: renamed from: q */
    public VLinear f73835q;

    /* JADX INFO: renamed from: r */
    public TextView f73836r;

    /* JADX INFO: renamed from: s */
    public TextView f73837s;

    /* JADX INFO: renamed from: t */
    public LiveBaseAdapter f73838t;

    public b6k(@NonNull t5k t5kVar) {
        super(t6c0.f168232W8, t5kVar.act(), t5kVar);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m100413G(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m100418N(View view) {
        mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m100419O(View view) {
        ((t5k) this.f47757b).m187317d4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m100420P(View view) {
        ((t5k) this.f47757b).m187318e4();
    }

    /* JADX INFO: renamed from: L */
    public final void m100421L(View view) {
        c6k.m105483a(this, view);
    }

    /* JADX INFO: renamed from: M */
    public View m100422M(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c6k.m105484b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m100423Q(View view) {
        ((t5k) this.f47757b).m129317w3(ddv.f85630B, t100.m186890d(560.0f), 7005, 24);
    }

    /* JADX INFO: renamed from: R */
    public void m100424R(List<BLiveVoiceGrabHatCP> list, BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new v2n0(bcn0.m101093b(bLiveVoiceGrabHatGame)));
        boolean zM200296J = vwb.m200296J(list);
        TextView textView = this.f73834p;
        if (zM200296J) {
            xdl0.m208344M(textView, true);
        } else {
            int i = 0;
            xdl0.m208344M(textView, false);
            while (i < list.size()) {
                BLiveVoiceGrabHatCP bLiveVoiceGrabHatCP = list.get(i);
                i++;
                final t5k t5kVar = (t5k) this.f47757b;
                Objects.requireNonNull(t5kVar);
                arrayList.add(new c3n0(bLiveVoiceGrabHatCP, i, new e30() { // from class: l.z5k
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        t5kVar.m187329r4((String) obj);
                    }
                }));
            }
        }
        this.f73838t.m67371Z(arrayList);
        m100425S(bLiveVoiceGrabHatGame);
    }

    /* JADX INFO: renamed from: S */
    public void m100425S(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        if (bcn0.m101093b(bLiveVoiceGrabHatGame)) {
            m100426T(bLiveVoiceGrabHatGame);
        } else {
            m100427U(bLiveVoiceGrabHatGame);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m100426T(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        m100429W(bLiveVoiceGrabHatGame);
        m100428V(R$string.f47074Y2);
    }

    /* JADX INFO: renamed from: U */
    public final void m100427U(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        m100429W(bLiveVoiceGrabHatGame);
        m100428V(R$string.f47022Vd);
    }

    /* JADX INFO: renamed from: V */
    public void m100428V(int i) {
        this.f73837s.setText(i);
    }

    /* JADX INFO: renamed from: W */
    public final void m100429W(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        d1q d1qVar = (d1q) vwb.m200346r(this.f73838t.m67355J(), new w9j() { // from class: l.a6k
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((d1q) obj) instanceof v2n0);
            }
        });
        if (d1qVar != null) {
            v2n0 v2n0Var = (v2n0) d1qVar;
            v2n0Var.m196809I(bcn0.m101093b(bLiveVoiceGrabHatGame));
            this.f73838t.m67360O(v2n0Var);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m100422M(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m100421L(view);
        this.f73838t = new LiveBaseAdapter();
        this.f73833o.setLayoutManager(new LinearLayoutManager(view.getContext()));
        this.f73833o.setAdapter(this.f73838t);
        if (!((t5k) this.f47757b).m206032L2()) {
            xdl0.m208344M(this.f73835q, false);
            xdl0.m208325C0(this.f73832n, t100.m186890d(366.0f));
        }
        xdl0.m208329E0(this.f73830l, new View.OnClickListener() { // from class: l.u5k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b6k.m100413G(view2);
            }
        });
        xdl0.m208329E0(this.f73829k, new View.OnClickListener() { // from class: l.v5k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f180062a.m100418N(view2);
            }
        });
        xdl0.m208329E0(this.f73836r, new View.OnClickListener() { // from class: l.w5k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f184707a.m100419O(view2);
            }
        });
        xdl0.m208329E0(this.f73837s, new View.OnClickListener() { // from class: l.x5k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f191169a.m100420P(view2);
            }
        });
        xdl0.m208329E0(this.f73831m, new View.OnClickListener() { // from class: l.y5k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f196446a.m100423Q(view2);
            }
        });
    }
}
