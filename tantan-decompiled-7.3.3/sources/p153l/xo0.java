package p153l;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Process;
import com.sunshine.engine.base.AbstractC13647a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.SAXParserFactory;

/* JADX INFO: loaded from: classes11.dex */
public class xo0 {

    /* JADX INFO: renamed from: a */
    private static List<AbstractC13647a> f195546a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private static boolean f195547b = false;

    /* JADX INFO: renamed from: l.xo0$b */
    public static class RunnableC21401b implements Runnable {
        private RunnableC21401b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            InputStream inputStreamOpen;
            Process.setThreadPriority(10);
            for (AbstractC13647a abstractC13647aM212444c = xo0.m212444c(); abstractC13647aM212444c != null; abstractC13647aM212444c = xo0.m212444c()) {
                InputStream inputStream = null;
                mediaPlayer = null;
                MediaPlayer mediaPlayer = null;
                try {
                    try {
                        boolean zExists = new File(abstractC13647aM212444c.f56502b).exists();
                        boolean z = !zExists;
                        inputStreamOpen = !zExists ? abstractC13647aM212444c.f56501a.m82159j().getResources().getAssets().open(abstractC13647aM212444c.f56502b) : new FileInputStream(new File(abstractC13647aM212444c.f56502b));
                        try {
                            xo0.m212446e(inputStreamOpen, abstractC13647aM212444c);
                            boolean z2 = true;
                            abstractC13647aM212444c.f56520t = true;
                            n9r.m162003a(abstractC13647aM212444c);
                            Bitmap bitmapM95704g = !zExists ? a2j0.m95704g(abstractC13647aM212444c.f56501a.m82159j(), abstractC13647aM212444c.f56503c) : BitmapFactory.decodeFile(abstractC13647aM212444c.f56503c);
                            if (abstractC13647aM212444c.f56504d != null) {
                                if (zExists) {
                                    mediaPlayer = new MediaPlayer();
                                    mediaPlayer.reset();
                                    mediaPlayer.setDataSource(abstractC13647aM212444c.f56504d);
                                } else {
                                    AssetFileDescriptor assetFileDescriptorM95703f = a2j0.m95703f(abstractC13647aM212444c.f56501a.m82159j(), abstractC13647aM212444c.f56504d);
                                    if (assetFileDescriptorM95703f != null) {
                                        MediaPlayer mediaPlayer2 = new MediaPlayer();
                                        mediaPlayer2.reset();
                                        mediaPlayer2.setDataSource(assetFileDescriptorM95703f.getFileDescriptor(), assetFileDescriptorM95703f.getStartOffset(), assetFileDescriptorM95703f.getLength());
                                        mediaPlayer = mediaPlayer2;
                                    }
                                }
                            }
                            if (bitmapM95704g != null) {
                                abstractC13647aM212444c.f56501a.m82156g("in parse").m82156g("   entity.hashCode()=" + abstractC13647aM212444c.hashCode()).m82156g("   bmp.hashCode()=" + bitmapM95704g.hashCode()).m82156g("   entity.configPath=" + abstractC13647aM212444c.f56502b).m82156g("   entity.picPath=" + abstractC13647aM212444c.f56503c).m82156g("   entity.inAsset=" + z);
                                if (bitmapM95704g.isRecycled()) {
                                    abstractC13647aM212444c.f56501a.m82156g("   bmp.isRecycled() in parse").m82160k();
                                    z2 = false;
                                } else {
                                    if (mediaPlayer != null) {
                                        mediaPlayer.prepare();
                                    }
                                    abstractC13647aM212444c.mo82141j(bitmapM95704g, mediaPlayer);
                                }
                            } else {
                                z2 = false;
                            }
                            if (inputStreamOpen != null) {
                                try {
                                    inputStreamOpen.close();
                                } catch (IOException e) {
                                    a2j0.m95707j(e);
                                }
                            }
                            if (!z2) {
                                abstractC13647aM212444c.f56501a.m82165r(abstractC13647aM212444c);
                            }
                        } catch (Exception e2) {
                            e = e2;
                            inputStream = inputStreamOpen;
                            a2j0.m95707j(e);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e3) {
                                    a2j0.m95707j(e3);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (inputStreamOpen != null) {
                                try {
                                    inputStreamOpen.close();
                                } catch (IOException e4) {
                                    a2j0.m95707j(e4);
                                }
                            }
                            abstractC13647aM212444c.f56501a.m82165r(abstractC13647aM212444c);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamOpen = null;
                    }
                } catch (Exception e5) {
                    e = e5;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static synchronized AbstractC13647a m212444c() {
        if (f195546a.size() > 0) {
            return f195546a.remove(0);
        }
        f195547b = false;
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m212445d(AbstractC13647a abstractC13647a) {
        if (abstractC13647a != null) {
            f195546a.add(abstractC13647a);
            if (!f195547b) {
                f195547b = true;
                new Thread(new RunnableC21401b()).start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static void m212446e(InputStream inputStream, AbstractC13647a abstractC13647a) throws Exception {
        SAXParserFactory.newInstance().newSAXParser().parse(inputStream, abstractC13647a.mo82136e());
    }

    /* JADX INFO: renamed from: f */
    public static synchronized void m212447f(AbstractC13647a abstractC13647a) {
        f195546a.remove(abstractC13647a);
    }
}
