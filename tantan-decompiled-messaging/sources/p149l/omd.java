package p149l;

import android.R;
import android.os.Environment;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class omd extends t7e {

    /* JADX INFO: renamed from: h */
    private q500 f144609h = new q500.C19428a().m172988d(5000).m172990f(10000).m172989e(10000).m172987c();

    /* JADX INFO: renamed from: l.omd$b */
    public class C18976b implements t7e.InterfaceC20117a {
        public C18976b() {
        }

        @Override // p149l.t7e.InterfaceC20117a
        /* JADX INFO: renamed from: a */
        public u500 mo165036a(String str, Map<String, String> map, boolean z) throws Exception {
            return omd.this.f144609h.m172984c(new t500.C20109b().m187252l(map).m187253m(str).m187251k());
        }
    }

    public omd() {
        m187425e(new C18977c()).m187421a(new C18976b()).m187424d(new C18975a()).m187426f(Environment.getExternalStorageDirectory().getAbsolutePath()).m187422b(R.drawable.stat_sys_download).m187423c(R.drawable.stat_sys_download);
    }

    /* JADX INFO: renamed from: l.omd$a */
    public class C18975a implements t7e.InterfaceC20118b {
        public C18975a() {
        }

        @Override // p149l.t7e.InterfaceC20118b
        /* JADX INFO: renamed from: a */
        public void mo165035a(q8e q8eVar) {
        }
    }

    /* JADX INFO: renamed from: l.omd$c */
    public class C18977c implements t7e.InterfaceC20119c {
        public C18977c() {
        }

        @Override // p149l.t7e.InterfaceC20119c
        /* JADX INFO: renamed from: a */
        public void mo165037a(q8e q8eVar, int i) {
        }

        @Override // p149l.t7e.InterfaceC20119c
        /* JADX INFO: renamed from: b */
        public void mo165038b(int i, String str) {
        }
    }
}
