package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.OMSDialogInfo;
import com.p046p1.mobile.putong.data.OMSDialogType;
import com.p046p1.mobile.putong.data.OMSMorphBaseStyle;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.oms.OmsBaseRender;
import com.p046p1.mobile.putong.p065ui.oms.OmsPageAct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/* JADX INFO: loaded from: classes11.dex */
public class nc50 {

    /* JADX INFO: renamed from: d */
    public static nc50 f138124d;

    /* JADX INFO: renamed from: a */
    public HashMap<String, C18671a> f138125a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public ArrayList<zuj0> f138126b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public Stack<OmsBaseRender> f138127c = new Stack<>();

    /* JADX INFO: renamed from: l.nc50$a */
    public static class C18671a {

        /* JADX INFO: renamed from: a */
        public View f138128a;

        /* JADX INFO: renamed from: b */
        public WeakReference<PutongAct> f138129b;
    }

    /* JADX INFO: renamed from: f */
    public static nc50 m158912f() {
        if (f138124d == null) {
            synchronized (nc50.class) {
                try {
                    if (f138124d == null) {
                        f138124d = new nc50();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f138124d;
    }

    /* JADX INFO: renamed from: a */
    public PutongAct m158913a(String str) {
        if (this.f138125a.get(str).f138129b == null) {
            return null;
        }
        return this.f138125a.get(str).f138129b.get();
    }

    /* JADX INFO: renamed from: b */
    public List<zuj0> m158914b() {
        return this.f138126b;
    }

    /* JADX INFO: renamed from: c */
    public void m158915c() {
        this.f138126b.clear();
    }

    /* JADX INFO: renamed from: d */
    public boolean m158916d(String str) {
        return this.f138125a.containsKey(str);
    }

    /* JADX INFO: renamed from: e */
    public View m158917e(String str) {
        return this.f138125a.get(str).f138128a;
    }

    /* JADX INFO: renamed from: g */
    public OmsBaseRender m158918g(String str) {
        for (OmsBaseRender omsBaseRender : this.f138127c) {
            if (TextUtils.equals(omsBaseRender.f54222b.identifier, str)) {
                return omsBaseRender;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public OmsBaseRender m158919h() {
        if (this.f138127c.isEmpty()) {
            return null;
        }
        return this.f138127c.peek();
    }

    /* JADX INFO: renamed from: i */
    public OmsBaseRender m158920i() {
        if (this.f138127c.isEmpty()) {
            return null;
        }
        return this.f138127c.pop();
    }

    /* JADX INFO: renamed from: j */
    public void m158921j(OmsBaseRender omsBaseRender) {
        this.f138127c.push(omsBaseRender);
    }

    /* JADX INFO: renamed from: k */
    public void m158922k(List<zuj0> list) {
        this.f138126b.addAll(list);
    }

    /* JADX INFO: renamed from: l */
    public void m158923l(String str) {
        this.f138125a.remove(str);
    }

    /* JADX INFO: renamed from: m */
    public void m158924m(String str, PutongAct putongAct) {
        this.f138125a.get(str).f138129b = new WeakReference<>(putongAct);
    }

    /* JADX INFO: renamed from: n */
    public boolean m158925n(Act act, OMSDialogInfo oMSDialogInfo) {
        OmsBaseRender omsBaseRender = new OmsBaseRender(act, oMSDialogInfo);
        if (oMSDialogInfo != null && TEnum.equals(oMSDialogInfo.contentType, OMSDialogType.morph)) {
            omsBaseRender.m79258R();
            if (omsBaseRender.f54229i != null && !omsBaseRender.f54228h) {
                if (!TEnum.equals(oMSDialogInfo.content.morph.baseStyle, OMSMorphBaseStyle.fullScreen)) {
                    omsBaseRender.m79269c0();
                    return true;
                }
                C18671a c18671a = new C18671a();
                c18671a.f138128a = omsBaseRender.f54229i;
                this.f138125a.put(oMSDialogInfo.identifier, c18671a);
                omsBaseRender.f54230j = true;
                act.startActivity(OmsPageAct.m79874Y1(act, oMSDialogInfo.identifier, oMSDialogInfo.mercury, oMSDialogInfo.cancelAble));
                return true;
            }
        }
        return false;
    }
}
