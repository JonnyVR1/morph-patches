package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.CoreTaskCenterAct;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.CoreTaskItemUploadProfileView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.RealPicturesInfo;
import java.util.ArrayList;
import l.dac0;
import l.f6c0;
import l.s7m;
import l.u4c0;
import l.vwb;
import l.w9j;
import l.xdl0;
import v.VRecyclerView;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class e7b implements s7m<c7b> {

    /* JADX INFO: renamed from: a */
    public final CoreTaskCenterAct f12431a;

    /* JADX INFO: renamed from: b */
    public c7b f12432b;

    /* JADX INFO: renamed from: c */
    public VNavigationBar f12433c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f12434d;

    /* JADX INFO: renamed from: e */
    public C0873a f12435e;

    /* JADX INFO: renamed from: f */
    public View f12436f;

    /* JADX INFO: renamed from: g */
    public View f12437g;

    /* JADX INFO: renamed from: h */
    public VText f12438h;

    /* JADX INFO: renamed from: l.e7b$a */
    public static class C0873a extends dac0<mei0> {

        /* JADX INFO: renamed from: c */
        public final Act f12439c;

        /* JADX INFO: renamed from: d */
        public final c7b f12440d;

        /* JADX INFO: renamed from: e */
        public ArrayList<mei0> f12441e;

        public C0873a(Act act, c7b c7bVar) {
            ArrayList<mei0> arrayList = new ArrayList<>();
            this.f12441e = arrayList;
            this.f12439c = act;
            this.f12440d = c7bVar;
            arrayList.add(new mei0(1));
            this.f12441e.add(new mei0(-1));
        }

        /* JADX INFO: renamed from: C */
        public int m13787C() {
            return this.f12441e.size();
        }

        /* JADX INFO: renamed from: D */
        public View m13788D(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return this.f12439c.inflater().inflate(f6c0.Bc, viewGroup, false);
            }
            if (i == -1) {
                return this.f12439c.inflater().inflate(f6c0.Ac, viewGroup, false);
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void m13786A(View view, mei0 mei0Var, int i, int i2) {
            if (i == 1) {
                ((CoreTaskItemUploadProfileView) view).m7571V0(this.f12439c, this.f12440d, mei0Var);
            }
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public mei0 getItem(int i) {
            return this.f12441e.get(i);
        }

        /* JADX INFO: renamed from: H */
        public void m13791H(final int i, Object obj) {
            int iG = vwb.G(this.f12441e, new w9j() { // from class: l.d7b
                public final Object call(Object obj2) {
                    return Boolean.valueOf(((mei0) obj2).f16853a == i);
                }
            });
            if (iG >= 0) {
                this.f12441e.get(iG).f16854b = obj;
                notifyItemChanged(iG);
            }
        }

        public int getItemViewType(int i) {
            return getItem(i).f16853a;
        }
    }

    public e7b(CoreTaskCenterAct coreTaskCenterAct) {
        this.f12431a = coreTaskCenterAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m13778C0() {
        return this.f12431a;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m13783i1(c7b c7bVar) {
        this.f12432b = c7bVar;
    }

    @Nullable
    public Act act() {
        return this.f12431a;
    }

    /* JADX INFO: renamed from: b */
    public void m13780b(boolean z) {
        xdl0.M(this.f12434d, !z);
        xdl0.M(this.f12436f, z);
        if (z) {
            xdl0.M(this.f12438h, true);
            xdl0.M(this.f12437g, true);
            this.f12438h.setText("当前网络不可用");
        }
    }

    /* JADX INFO: renamed from: c */
    public void m13781c() {
        xdl0.M(this.f12434d, false);
        xdl0.M(this.f12436f, true);
        xdl0.M(this.f12438h, true);
        xdl0.M(this.f12437g, false);
        this.f12438h.setText("加载中...");
    }

    /* JADX INFO: renamed from: d */
    public void m13782d(RealPicturesInfo realPicturesInfo) {
        this.f12435e.m13791H(1, realPicturesInfo);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.zc, viewGroup, false);
        this.f12434d = viewInflate.findViewById(u4c0.b7);
        this.f12433c = viewInflate.findViewById(u4c0.L8);
        this.f12436f = viewInflate.findViewById(u4c0.G3);
        this.f12437g = viewInflate.findViewById(u4c0.i6);
        this.f12438h = viewInflate.findViewById(u4c0.Be);
        this.f12433c.setTitle("完成任务，免费领特权");
        this.f12433c.setLeftIconAsBack(this.f12431a);
        m13784r();
        return viewInflate;
    }

    /* JADX INFO: renamed from: r */
    public void m13784r() {
        this.f12435e = new C0873a(act(), this.f12432b);
        this.f12434d.setLayoutManager(new LinearLayoutManager(act()));
        this.f12434d.setAdapter(this.f12435e);
        this.f12435e.notifyDataSetChanged();
    }

    public void destroy() {
    }
}
