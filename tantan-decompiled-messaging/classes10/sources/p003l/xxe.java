package p003l;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.ui.download.DownloadTask;
import com.p1.mobile.putong.ui.download.a;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import l.c4p;
import l.e51;
import l.f30;
import l.mqi0;
import l.qib0;
import l.uqd0;
import l.vwb;
import l.yt0;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xxe {

    /* JADX INFO: renamed from: a */
    public String f8586a;

    /* JADX INFO: renamed from: b */
    public final uqd0 f8587b;

    /* JADX INFO: renamed from: c */
    public final uqd0 f8588c;

    /* JADX INFO: renamed from: d */
    public final uqd0 f8589d;

    /* JADX INFO: renamed from: e */
    public boolean f8590e;

    /* JADX INFO: renamed from: f */
    public final String f8591f;

    /* JADX INFO: renamed from: g */
    public final JsonObject f8592g;

    /* JADX INFO: renamed from: l.xxe$a */
    public static class C3486a {

        /* JADX INFO: renamed from: a */
        public static final xxe f8593a = new xxe();
    }

    public xxe() {
        this.f8586a = "https://auto.tancdn.com/v1/raw/8dbff645-f568-4b9a-8f8d-6820fdce77ee13.zip";
        this.f8587b = new uqd0("emoji_apng_downloaded_v6", "");
        this.f8588c = new uqd0("has_mapping_txt", "");
        this.f8589d = new uqd0("mapping_text_sp", "");
        this.f8590e = false;
        this.f8591f = ":";
        this.f8592g = new JsonObject();
    }

    /* JADX INFO: renamed from: f */
    public static File m10984f() {
        File filesDir = CoreModule.b.getFilesDir();
        return filesDir == null ? CoreModule.b.getFilesDir() : filesDir;
    }

    /* JADX INFO: renamed from: g */
    public static String m10985g() {
        File fileM10984f = m10984f();
        if (!NullChecker.a(fileM10984f) || !fileM10984f.exists()) {
            return "";
        }
        return fileM10984f.getAbsolutePath() + File.separator + "tantandynamicfile";
    }

    /* JADX INFO: renamed from: h */
    public static final xxe m10986h() {
        return C3486a.f8593a;
    }

    /* JADX INFO: renamed from: e */
    public void m10987e() {
        String str;
        if (c4p.INSTANCE.b() || this.f8590e) {
            return;
        }
        this.f8590e = true;
        String strM10985g = m10985g();
        File fileM10984f = m10984f();
        if (!TextUtils.isEmpty(strM10985g) && eva.m6323c(fileM10984f)) {
            final File file = new File(strM10985g);
            if (file.exists() || (!file.exists() && file.mkdirs())) {
                str = strM10985g + File.separator + "tantandynamiczipfile";
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (!TextUtils.isEmpty((CharSequence) this.f8587b.get()) && TextUtils.equals((CharSequence) this.f8587b.get(), this.f8586a)) {
                if (yt0.c()) {
                    return;
                }
                this.f8592g.addProperty("from", "hasParsedEmojiMapping");
                e51.y(new Runnable() { // from class: l.txe
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7637a.m10989j(file);
                    }
                });
                return;
            }
            final String path = file.getPath();
            DownloadTask downloadTaskA = new DownloadTask.b(qib0.H.getDownloadHttp()).q(this.f8586a).o(str).j(new f30() { // from class: l.uxe
                public final void call(Object obj, Object obj2) {
                    this.f7835a.m10991l(file, path, (DownloadTask) obj, (File) obj2);
                }
            }).f(new f30() { // from class: l.vxe
                public final void call(Object obj, Object obj2) {
                    Throwable th = (Throwable) obj2;
                    CrashHelper.c(new Exception("downloadFromSuggestions.json Fail exception:" + th.getMessage(), th));
                }
            }).a();
            if (a.u().y(downloadTaskA.x())) {
                return;
            }
            a.u().o(downloadTaskA);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m10988i(String str, boolean z) {
        BufferedReader bufferedReader;
        this.f8592g.addProperty("localFile", str);
        HashMap map = new HashMap();
        File file = new File(str + File.separator + "dynamicfileparse.txt");
        StringBuilder sb = new StringBuilder();
        if (!z) {
            sb.append("EmojiLoadUtils downloadtime ");
            sb.append(mqi0.o());
            sb.append("file exit = ");
            sb.append(file.exists());
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        } catch (FileNotFoundException unused) {
            this.f8592g.addProperty("file_exit", Boolean.valueOf(file.exists()));
            this.f8592g.addProperty("mapping_exit", (String) this.f8588c.get());
            if (!TextUtils.isEmpty(str)) {
                JsonArray jsonArray = new JsonArray();
                File file2 = new File(str);
                if (file2.exists()) {
                    String[] list = file2.list();
                    if (!vwb.K(list)) {
                        for (String str2 : list) {
                            jsonArray.add(str2);
                            if (TextUtils.equals(str2, "dynamicfilepic")) {
                                File file3 = new File(str + "/dynamicfilepic");
                                if (file3.exists() && file3.isDirectory()) {
                                    String[] list2 = file3.list();
                                    if (NullChecker.a(list2) && list2.length > 0) {
                                        this.f8592g.addProperty("picDirLength", Integer.valueOf(list2.length));
                                    }
                                }
                            }
                        }
                    }
                }
                this.f8592g.add("children", jsonArray);
            }
            CrashHelper.d(new FileNotFoundException(this.f8592g.toString()), 100);
            bufferedReader = null;
        }
        try {
            if (bufferedReader == null) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    jSONArray.put(line);
                    String[] strArrSplit = line.split(":");
                    map.put(strArrSplit[0], str + "/dynamicfilepic/" + strArrSplit[1] + ".png");
                    yt0.d(strArrSplit[0], str + "/dynamicfilepic/" + strArrSplit[1] + ".png");
                }
                this.f8589d.put(jSONArray.toString());
                if (!z) {
                    sb.append("emojiToPath size = ");
                    sb.append(map.size());
                }
                this.f8587b.put(this.f8586a);
                if (!z) {
                    this.f8588c.put(sb.toString());
                }
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e2) {
                CrashHelper.c(e2);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m10989j(File file) {
        m10992m(file.getPath(), true);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m10990k(File file, File file2, String str) {
        if (eva.m6329i(file.getAbsolutePath(), file2 + File.separator)) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("from", "DownloadTask");
            jsonObject.addProperty("zip_file_path", file.getAbsolutePath());
            m10992m(str, false);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m10991l(final File file, final String str, DownloadTask downloadTask, final File file2) {
        e51.y(new Runnable() { // from class: l.wxe
            @Override // java.lang.Runnable
            public final void run() {
                this.f8266a.m10990k(file2, file, str);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m10992m(String str, boolean z) {
        JSONArray jSONArray;
        if (!z) {
            m10988i(str, false);
            return;
        }
        String str2 = (String) this.f8589d.get();
        if (TextUtils.isEmpty(str2)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str2);
            } catch (JSONException e) {
                CrashHelper.c(e);
                jSONArray = null;
            }
        }
        if (!NullChecker.a(jSONArray) || jSONArray.length() <= 0) {
            m10988i(str, true);
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String string = jSONArray.get(i).toString();
                if (!TextUtils.isEmpty(string)) {
                    String[] strArrSplit = string.split(":");
                    if (strArrSplit.length > 1) {
                        yt0.d(strArrSplit[0], str + "/dynamicfilepic/" + strArrSplit[1] + ".png");
                    } else {
                        continue;
                    }
                }
            } catch (JSONException e2) {
                CrashHelper.c(e2);
                return;
            }
        }
    }
}
