package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.settings.addemoji.AddEmojiAct;
import com.p046p1.mobile.putong.data.EmojiType;
import com.p046p1.mobile.putong.data.User;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class v80 implements s7m<u80> {

    /* JADX INFO: renamed from: a */
    public RecyclerView f180436a;

    /* JADX INFO: renamed from: b */
    public u80 f180437b;

    /* JADX INFO: renamed from: c */
    public AddEmojiAct f180438c;

    /* JADX INFO: renamed from: d */
    public ywe f180439d;

    public v80(AddEmojiAct addEmojiAct) {
        this.f180438c = addEmojiAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f180438c;
    }

    /* JADX INFO: renamed from: a */
    public View m197388a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return w80.m202086b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f180438c;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(u80 u80Var) {
        this.f180437b = u80Var;
    }

    /* JADX INFO: renamed from: c */
    public void m197390c(List<EmojiType> list) {
        ywe yweVar = new ywe(act());
        this.f180439d = yweVar;
        yweVar.m216385T(list);
        this.f180436a.setAdapter(this.f180439d);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), 4);
        gridLayoutManager.m3326v(new eye(this.f180439d, gridLayoutManager));
        this.f180436a.setLayoutManager(gridLayoutManager);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (vwb.m200296J(userM169527p9.profile.extensions.interest.emoji)) {
            return;
        }
        this.f180439d.m216387V(Integer.parseInt(userM169527p9.profile.extensions.interest.emoji.get(0)));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m197388a(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
