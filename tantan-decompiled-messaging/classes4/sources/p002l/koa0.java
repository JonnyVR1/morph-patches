package p002l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l.e30;
import l.j760;
import l.mcr;
import l.mkd0;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class koa0 extends xne {
    public koa0(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ int m16724W(LiteraturesComments literaturesComments, LiteraturesComments literaturesComments2) {
        return (int) (literaturesComments2.updatedTime - literaturesComments.updatedTime);
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ int m16728a0(List list, final LiteraturesComments literaturesComments, final LiteraturesComments literaturesComments2) {
        LiteraturesComments literaturesComments3 = (LiteraturesComments) vwb.r(list, new w9j() { // from class: l.ioa0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiteraturesComments) obj).literatureID, literaturesComments.literatureID));
            }
        });
        LiteraturesComments literaturesComments4 = (LiteraturesComments) vwb.r(list, new w9j() { // from class: l.joa0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiteraturesComments) obj).literatureID, literaturesComments2.literatureID));
            }
        });
        if (NullChecker.a(literaturesComments3) && NullChecker.a(literaturesComments4)) {
            return (int) (literaturesComments4.updatedTime - literaturesComments3.updatedTime);
        }
        return 0;
    }

    @Override // p002l.xne
    /* JADX INFO: renamed from: U */
    public void mo16729U() {
        if (vwb.J(this.f22369F)) {
            return;
        }
        if (!mo3351O().mo1523P1()) {
            mo3351O().act().duringCreated(c.just(BookMoviesDramasHelper.l(CoreModule.H().userId()))).subscribe(mkd0.G(new e30() { // from class: l.eoa0
                public final void call(Object obj) {
                    this.f9894a.m16730b0((List) obj);
                }
            }));
        }
        this.f22368E = BookMoviesDramasHelper.k(this.f22369F);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m16730b0(final List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (final LiteraturesComments literaturesComments : this.f22369F) {
            if (NullChecker.a((LiteraturesComments) vwb.r(list, new w9j() { // from class: l.foa0
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((LiteraturesComments) obj).literatureID, literaturesComments.literatureID));
                }
            }))) {
                arrayList.add(literaturesComments);
            } else {
                arrayList2.add(literaturesComments);
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: l.goa0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return koa0.m16728a0(list, (LiteraturesComments) obj, (LiteraturesComments) obj2);
            }
        });
        Collections.sort(arrayList2, new Comparator() { // from class: l.hoa0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return koa0.m16724W((LiteraturesComments) obj, (LiteraturesComments) obj2);
            }
        });
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.f22369F = arrayList3;
    }

    @Override // p002l.xne, p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        this.f22372v.setTextSize(18.0f);
        this.f22372v.setTextColor(Color.parseColor("#e6000000"));
    }

    @Override // p002l.xne, p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        j760<List<Literatures>, List<LiteraturesComments>> j760VarMo1510H3 = mo3351O().mo1510H3();
        if (NullChecker.a(j760VarMo1510H3)) {
            this.f22369F = (List) j760VarMo1510H3.b;
        }
        return (mo3351O().mo1570m0() || vwb.J(this.f22369F)) ? false : true;
    }
}
