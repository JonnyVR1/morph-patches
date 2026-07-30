package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.RealPicturesInfo;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.CoreTaskCenterAct;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.CoreTaskItemUploadProfileView;
import java.util.ArrayList;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class e7b implements s7m<c7b> {

    /* JADX INFO: renamed from: a */
    public final CoreTaskCenterAct f89681a;

    /* JADX INFO: renamed from: b */
    public c7b f89682b;

    /* JADX INFO: renamed from: c */
    public VNavigationBar f89683c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f89684d;

    /* JADX INFO: renamed from: e */
    public C16555a f89685e;

    /* JADX INFO: renamed from: f */
    public View f89686f;

    /* JADX INFO: renamed from: g */
    public View f89687g;

    /* JADX INFO: renamed from: h */
    public VText f89688h;

    /* JADX INFO: renamed from: l.e7b$a */
    public static class C16555a extends dac0<mei0> {

        /* JADX INFO: renamed from: c */
        public final Act f89689c;

        /* JADX INFO: renamed from: d */
        public final c7b f89690d;

        /* JADX INFO: renamed from: e */
        public ArrayList<mei0> f89691e;

        public C16555a(Act act, c7b c7bVar) {
            ArrayList<mei0> arrayList = new ArrayList<>();
            this.f89691e = arrayList;
            this.f89689c = act;
            this.f89690d = c7bVar;
            arrayList.add(new mei0(1));
            this.f89691e.add(new mei0(-1));
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f89691e.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return this.f89689c.inflater().inflate(f6c0.f95295Bc, viewGroup, false);
            }
            if (i == -1) {
                return this.f89689c.inflater().inflate(f6c0.f95279Ac, viewGroup, false);
            }
            return null;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, mei0 mei0Var, int i, int i2) {
            if (i == 1) {
                ((CoreTaskItemUploadProfileView) view).m43346V0(this.f89689c, this.f89690d, mei0Var);
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public mei0 getItem(int i) {
            return this.f89691e.get(i);
        }

        /* JADX INFO: renamed from: H */
        public void m115190H(final int i, Object obj) {
            int iM200293G = vwb.m200293G(this.f89691e, new w9j() { // from class: l.d7b
                @Override // p149l.w9j
                public final Object call(Object obj2) {
                    return Boolean.valueOf(((mei0) obj2).f133427a == i);
                }
            });
            if (iM200293G >= 0) {
                this.f89691e.get(iM200293G).f133428b = obj;
                notifyItemChanged(iM200293G);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return getItem(i).f133427a;
        }
    }

    public e7b(CoreTaskCenterAct coreTaskCenterAct) {
        this.f89681a = coreTaskCenterAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f89681a;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(c7b c7bVar) {
        this.f89682b = c7bVar;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f89681a;
    }

    /* JADX INFO: renamed from: b */
    public void m115183b(boolean z) {
        xdl0.m208344M(this.f89684d, !z);
        xdl0.m208344M(this.f89686f, z);
        if (z) {
            xdl0.m208344M(this.f89688h, true);
            xdl0.m208344M(this.f89687g, true);
            this.f89688h.setText("当前网络不可用");
        }
    }

    /* JADX INFO: renamed from: c */
    public void m115184c() {
        xdl0.m208344M(this.f89684d, false);
        xdl0.m208344M(this.f89686f, true);
        xdl0.m208344M(this.f89688h, true);
        xdl0.m208344M(this.f89687g, false);
        this.f89688h.setText("加载中...");
    }

    /* JADX INFO: renamed from: d */
    public void m115185d(RealPicturesInfo realPicturesInfo) {
        this.f89685e.m115190H(1, realPicturesInfo);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96118zc, viewGroup, false);
        this.f89684d = (VRecyclerView) viewInflate.findViewById(u4c0.f174176b7);
        this.f89683c = (VNavigationBar) viewInflate.findViewById(u4c0.f173912L8);
        this.f89686f = viewInflate.findViewById(u4c0.f173822G3);
        this.f89687g = viewInflate.findViewById(u4c0.f174294i6);
        this.f89688h = (VText) viewInflate.findViewById(u4c0.f173748Be);
        this.f89683c.setTitle("完成任务，免费领特权");
        this.f89683c.setLeftIconAsBack(this.f89681a);
        m115186r();
        return viewInflate;
    }

    /* JADX INFO: renamed from: r */
    public void m115186r() {
        this.f89685e = new C16555a(getAct(), this.f89682b);
        this.f89684d.setLayoutManager(new LinearLayoutManager(getAct()));
        this.f89684d.setAdapter(this.f89685e);
        this.f89685e.notifyDataSetChanged();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
