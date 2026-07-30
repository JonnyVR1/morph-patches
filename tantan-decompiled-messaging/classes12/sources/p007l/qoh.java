package p007l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiDialogStateItem;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.j760;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qoh extends dac0<Emotion> {

    /* JADX INFO: renamed from: c */
    public Act f12335c;

    /* JADX INFO: renamed from: d */
    public String f12336d;

    /* JADX INFO: renamed from: e */
    public String f12337e;

    /* JADX INFO: renamed from: g */
    public Emotion f12339g;

    /* JADX INFO: renamed from: h */
    public InterfaceC2472b f12340h;

    /* JADX INFO: renamed from: f */
    public List<Emotion> f12338f = new ArrayList();

    /* JADX INFO: renamed from: i */
    public l80<Emotion> f12341i = new C2471a();

    /* JADX INFO: renamed from: l.qoh$a */
    public class C2471a extends l80<Emotion> {
        public C2471a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo4975k(Emotion emotion, int i, View view) {
            zvf0.A("e_set_my_state_type", qoh.this.f12336d, new j760[]{vwb.Y("state_type_id", emotion.f209id)});
        }
    }

    /* JADX INFO: renamed from: l.qoh$b */
    public interface InterfaceC2472b {
        /* JADX INFO: renamed from: e */
        void mo10301e(Emotion emotion);
    }

    public qoh(Act act, String str, String str2) {
        this.f12335c = act;
        this.f12336d = str;
        this.f12337e = str2;
    }

    /* JADX INFO: renamed from: C */
    public int m13682C() {
        if (vwb.J(this.f12338f)) {
            return 0;
        }
        return this.f12338f.size() + 1;
    }

    /* JADX INFO: renamed from: D */
    public View m13683D(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return this.f12335c.inflater().inflate(o6c0.f11251l2, viewGroup, false);
        }
        View view = new View(this.f12335c);
        view.setLayoutParams(new RecyclerView.p(t100.y, t100.a));
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View, com.p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiDialogStateItem] */
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m13681A(View view, final Emotion emotion, int i, int i2) {
        if (i == 2) {
            ?? r4 = (FeedPoiDialogStateItem) view;
            r4.m6116Q(emotion, m13686I(emotion));
            xdl0.E0((View) r4, new View.OnClickListener() { // from class: l.poh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f11932a.m13687J(emotion, view2);
                }
            });
            this.f12341i.m11594h(view, emotion, i2);
        }
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public Emotion getItem(int i) {
        if (i == 0) {
            return null;
        }
        return this.f12338f.get(i - 1);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m13686I(Emotion emotion) {
        Emotion emotion2 = this.f12339g;
        if (emotion2 == null || emotion == null) {
            return false;
        }
        return TextUtils.equals(emotion2.f209id, emotion.f209id);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m13687J(Emotion emotion, View view) {
        m13690M(emotion);
    }

    /* JADX INFO: renamed from: K */
    public void m13688K(List<Emotion> list, Emotion emotion) {
        this.f12338f = list;
        this.f12339g = emotion;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m13689L(InterfaceC2472b interfaceC2472b) {
        this.f12340h = interfaceC2472b;
    }

    /* JADX INFO: renamed from: M */
    public void m13690M(Emotion emotion) {
        if (emotion == null) {
            return;
        }
        Emotion emotion2 = this.f12339g;
        if (emotion2 == null || !TextUtils.equals(emotion2.f209id, emotion.f209id)) {
            this.f12339g = emotion;
            notifyDataSetChanged();
            if (NullChecker.a(this.f12340h)) {
                this.f12340h.mo10301e(this.f12339g);
            }
            zvf0.u("e_set_my_state_type", this.f12336d, new j760[]{vwb.Y("state_type_id", emotion.f209id)});
        }
    }

    public int getItemViewType(int i) {
        return i == 0 ? 1 : 2;
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
        this.f12341i.m11597o();
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
        this.f12341i.m11597o();
    }
}
