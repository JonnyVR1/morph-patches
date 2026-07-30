package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.RealPicturesInfo;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.CoreTaskCenterAct;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.CoreTaskItemUploadProfileView;
import java.util.ArrayList;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class r8b implements iam<p8b> {

    /* JADX INFO: renamed from: a */
    public final CoreTaskCenterAct f161683a;

    /* JADX INFO: renamed from: b */
    public p8b f161684b;

    /* JADX INFO: renamed from: c */
    public VNavigationBar f161685c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f161686d;

    /* JADX INFO: renamed from: e */
    public C19788a f161687e;

    /* JADX INFO: renamed from: f */
    public View f161688f;

    /* JADX INFO: renamed from: g */
    public View f161689g;

    /* JADX INFO: renamed from: h */
    public VText f161690h;

    /* JADX INFO: renamed from: l.r8b$a */
    public static class C19788a extends jic0<mni0> {

        /* JADX INFO: renamed from: c */
        public final Act f161691c;

        /* JADX INFO: renamed from: d */
        public final p8b f161692d;

        /* JADX INFO: renamed from: e */
        public ArrayList<mni0> f161693e;

        public C19788a(Act act, p8b p8bVar) {
            ArrayList<mni0> arrayList = new ArrayList<>();
            this.f161693e = arrayList;
            this.f161691c = act;
            this.f161692d = p8bVar;
            arrayList.add(new mni0(1));
            this.f161693e.add(new mni0(-1));
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f161693e.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return this.f161691c.inflater().inflate(kec0.f125461Ic, viewGroup, false);
            }
            if (i == -1) {
                return this.f161691c.inflater().inflate(kec0.f125445Hc, viewGroup, false);
            }
            return null;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, mni0 mni0Var, int i, int i2) {
            if (i == 1) {
                ((CoreTaskItemUploadProfileView) view).m44532V0(this.f161691c, this.f161692d, mni0Var);
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public mni0 getItem(int i) {
            return this.f161693e.get(i);
        }

        /* JADX INFO: renamed from: H */
        public void m180183H(final int i, Object obj) {
            int iM147476G = jyb.m147476G(this.f161693e, new qcj() { // from class: l.q8b
                @Override // p153l.qcj
                public final Object call(Object obj2) {
                    return Boolean.valueOf(((mni0) obj2).f137703a == i);
                }
            });
            if (iM147476G >= 0) {
                this.f161693e.get(iM147476G).f137704b = obj;
                notifyItemChanged(iM147476G);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return getItem(i).f137703a;
        }
    }

    public r8b(CoreTaskCenterAct coreTaskCenterAct) {
        this.f161683a = coreTaskCenterAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f161683a;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(p8b p8bVar) {
        this.f161684b = p8bVar;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f161683a;
    }

    /* JADX INFO: renamed from: b */
    public void m180176b(boolean z) {
        bnl0.m105524M(this.f161686d, !z);
        bnl0.m105524M(this.f161688f, z);
        if (z) {
            bnl0.m105524M(this.f161690h, true);
            bnl0.m105524M(this.f161689g, true);
            this.f161690h.setText("当前网络不可用");
        }
    }

    /* JADX INFO: renamed from: c */
    public void m180177c() {
        bnl0.m105524M(this.f161686d, false);
        bnl0.m105524M(this.f161688f, true);
        bnl0.m105524M(this.f161690h, true);
        bnl0.m105524M(this.f161689g, false);
        this.f161690h.setText("加载中...");
    }

    /* JADX INFO: renamed from: d */
    public void m180178d(RealPicturesInfo realPicturesInfo) {
        this.f161687e.m180183H(1, realPicturesInfo);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125429Gc, viewGroup, false);
        this.f161686d = (VRecyclerView) viewInflate.findViewById(adc0.f70301d7);
        this.f161685c = (VNavigationBar) viewInflate.findViewById(adc0.f70034N8);
        this.f161688f = viewInflate.findViewById(adc0.f69944I3);
        this.f161689g = viewInflate.findViewById(adc0.f70418k6);
        this.f161690h = (VText) viewInflate.findViewById(adc0.f69887Ee);
        this.f161685c.setTitle("完成任务，免费领特权");
        this.f161685c.setLeftIconAsBack(this.f161683a);
        m180179r();
        return viewInflate;
    }

    /* JADX INFO: renamed from: r */
    public void m180179r() {
        this.f161687e = new C19788a(getAct(), this.f161684b);
        this.f161686d.setLayoutManager(new LinearLayoutManager(getAct()));
        this.f161686d.setAdapter(this.f161687e);
        this.f161687e.notifyDataSetChanged();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
