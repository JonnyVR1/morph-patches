package p149l;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public class xxe {

    /* JADX INFO: renamed from: a */
    public String f194852a;

    /* JADX INFO: renamed from: b */
    public final uqd0 f194853b;

    /* JADX INFO: renamed from: c */
    public final uqd0 f194854c;

    /* JADX INFO: renamed from: d */
    public final uqd0 f194855d;

    /* JADX INFO: renamed from: e */
    public boolean f194856e;

    /* JADX INFO: renamed from: f */
    public final String f194857f;

    /* JADX INFO: renamed from: g */
    public final JsonObject f194858g;

    /* JADX INFO: renamed from: l.xxe$a */
    public static class C21252a {

        /* JADX INFO: renamed from: a */
        public static final xxe f194859a = new xxe();
    }

    public xxe() {
        this.f194852a = "https://auto.tancdn.com/v1/raw/8dbff645-f568-4b9a-8f8d-6820fdce77ee13.zip";
        this.f194853b = new uqd0("emoji_apng_downloaded_v6", "");
        this.f194854c = new uqd0("has_mapping_txt", "");
        this.f194855d = new uqd0("mapping_text_sp", "");
        this.f194856e = false;
        this.f194857f = ":";
        this.f194858g = new JsonObject();
    }

    /* JADX INFO: renamed from: f */
    public static File m211467f() {
        File filesDir = CoreModule.f17544b.getFilesDir();
        return filesDir == null ? CoreModule.f17544b.getFilesDir() : filesDir;
    }

    /* JADX INFO: renamed from: g */
    public static String m211468g() {
        File fileM211467f = m211467f();
        if (!NullChecker.m81303a(fileM211467f) || !fileM211467f.exists()) {
            return "";
        }
        return fileM211467f.getAbsolutePath() + File.separator + "tantandynamicfile";
    }

    /* JADX INFO: renamed from: h */
    public static final xxe m211469h() {
        return C21252a.f194859a;
    }

    /* JADX INFO: renamed from: e */
    public void m211470e() {
        String str;
        if (c4p.INSTANCE.m105235b() || this.f194856e) {
            return;
        }
        this.f194856e = true;
        String strM211468g = m211468g();
        File fileM211467f = m211467f();
        if (!TextUtils.isEmpty(strM211468g) && eva.m118248c(fileM211467f)) {
            final File file = new File(strM211468g);
            if (file.exists() || (!file.exists() && file.mkdirs())) {
                str = strM211468g + File.separator + "tantandynamiczipfile";
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (!TextUtils.isEmpty(this.f194853b.get()) && TextUtils.equals(this.f194853b.get(), this.f194852a)) {
                if (yt0.m215994c()) {
                    return;
                }
                this.f194858g.addProperty("from", "hasParsedEmojiMapping");
                e51.m114774y(new Runnable() { // from class: l.txe
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f172503a.m211472j(file);
                    }
                });
                return;
            }
            final String path = file.getPath();
            DownloadTask downloadTaskM79626a = new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(this.f194852a).m79640o(str).m79635j(new f30() { // from class: l.uxe
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f178725a.m211474l(file, path, (DownloadTask) obj, (File) obj2);
                }
            }).m79631f(new f30() { // from class: l.vxe
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    Throwable th = (Throwable) obj2;
                    CrashHelper.m81296c(new Exception("downloadFromSuggestions.json Fail exception:" + th.getMessage(), th));
                }
            }).m79626a();
            if (C13111a.m79654u().m79674y(downloadTaskM79626a.m79623x())) {
                return;
            }
            C13111a.m79654u().m79665o(downloadTaskM79626a);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m211471i(String str, boolean z) {
        BufferedReader bufferedReader;
        this.f194858g.addProperty("localFile", str);
        HashMap map = new HashMap();
        File file = new File(str + File.separator + "dynamicfileparse.txt");
        StringBuilder sb = new StringBuilder();
        if (!z) {
            sb.append("EmojiLoadUtils downloadtime ");
            sb.append(mqi0.m155944o());
            sb.append("file exit = ");
            sb.append(file.exists());
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        } catch (FileNotFoundException unused) {
            this.f194858g.addProperty("file_exit", Boolean.valueOf(file.exists()));
            this.f194858g.addProperty("mapping_exit", this.f194854c.get());
            if (!TextUtils.isEmpty(str)) {
                JsonArray jsonArray = new JsonArray();
                File file2 = new File(str);
                if (file2.exists()) {
                    String[] list = file2.list();
                    if (!vwb.m200297K(list)) {
                        for (String str2 : list) {
                            jsonArray.add(str2);
                            if (TextUtils.equals(str2, "dynamicfilepic")) {
                                File file3 = new File(str + "/dynamicfilepic");
                                if (file3.exists() && file3.isDirectory()) {
                                    String[] list2 = file3.list();
                                    if (NullChecker.m81303a(list2) && list2.length > 0) {
                                        this.f194858g.addProperty("picDirLength", Integer.valueOf(list2.length));
                                    }
                                }
                            }
                        }
                    }
                }
                this.f194858g.add("children", jsonArray);
            }
            CrashHelper.m81297d(new FileNotFoundException(this.f194858g.toString()), 100);
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
                    yt0.m215995d(strArrSplit[0], str + "/dynamicfilepic/" + strArrSplit[1] + ".png");
                }
                this.f194855d.put(jSONArray.toString());
                this.f194855d.get();
                if (!z) {
                    sb.append("emojiToPath size = ");
                    sb.append(map.size());
                }
                this.f194853b.put(this.f194852a);
                if (!z) {
                    this.f194854c.put(sb.toString());
                }
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e2) {
                CrashHelper.m81296c(e2);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m211472j(File file) {
        m211475m(file.getPath(), true);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m211473k(File file, File file2, String str) {
        if (eva.m118254i(file.getAbsolutePath(), file2 + File.separator)) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("from", "DownloadTask");
            jsonObject.addProperty("zip_file_path", file.getAbsolutePath());
            m211475m(str, false);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m211474l(final File file, final String str, DownloadTask downloadTask, final File file2) {
        e51.m114774y(new Runnable() { // from class: l.wxe
            @Override // java.lang.Runnable
            public final void run() {
                this.f188469a.m211473k(file2, file, str);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m211475m(String str, boolean z) {
        JSONArray jSONArray;
        if (!z) {
            m211471i(str, false);
            return;
        }
        String str2 = this.f194855d.get();
        if (TextUtils.isEmpty(str2)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str2);
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
                jSONArray = null;
            }
        }
        if (!NullChecker.m81303a(jSONArray) || jSONArray.length() <= 0) {
            m211471i(str, true);
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String string = jSONArray.get(i).toString();
                if (!TextUtils.isEmpty(string)) {
                    String[] strArrSplit = string.split(":");
                    if (strArrSplit.length > 1) {
                        yt0.m215995d(strArrSplit[0], str + "/dynamicfilepic/" + strArrSplit[1] + ".png");
                    } else {
                        continue;
                    }
                }
            } catch (JSONException e2) {
                CrashHelper.m81296c(e2);
                return;
            }
        }
    }
}
