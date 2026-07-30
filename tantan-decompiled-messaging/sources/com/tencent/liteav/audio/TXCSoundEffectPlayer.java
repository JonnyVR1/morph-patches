package com.tencent.liteav.audio;

import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C14049c;
import com.tencent.liteav.basic.util.C14052f;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TXCSoundEffectPlayer implements TXAudioEffectManager.TXMusicPlayObserver {
    private static final String TAG = "AudioCenter:TXCSoundEffectPlayer";
    private static WeakReference<InterfaceC13982c> mWeakSoundEffectListener;
    private List<Integer> mShortEffectorIDList = new ArrayList();

    /* JADX INFO: renamed from: com.tencent.liteav.audio.TXCSoundEffectPlayer$a */
    public static class C13977a {

        /* JADX INFO: renamed from: a */
        private static final TXCSoundEffectPlayer f57983a = new TXCSoundEffectPlayer();
    }

    static {
        C14052f.m83056f();
    }

    private String checkIfAssetsFile(String str) throws Throwable {
        long length;
        String str2;
        if (!TextUtils.isEmpty(str) && TXCCommonUtil.getAppContext() != null) {
            if (!str.startsWith("/assets/")) {
                return str;
            }
            String strSubstring = str.substring(8);
            try {
                try {
                    length = TXCCommonUtil.getAppContext().getAssets().openFd(strSubstring).getLength();
                } catch (Exception e) {
                    TXCLog.m82966e(TAG, "playAudioEffect openFd error " + e.toString());
                    length = 0;
                }
                String effectCachePath = getEffectCachePath();
                File file = new File(effectCachePath);
                if (!file.exists()) {
                    file.mkdirs();
                } else if (file.isFile()) {
                    file.delete();
                    file.mkdirs();
                }
                int iLastIndexOf = strSubstring.lastIndexOf(File.separatorChar);
                if (iLastIndexOf != -1) {
                    str2 = effectCachePath + File.separator + length + "_" + strSubstring.substring(iLastIndexOf + 1);
                } else {
                    str2 = effectCachePath + File.separator + length + "_" + strSubstring;
                }
                str = str2;
                if (!C14049c.m83026a(str)) {
                    C14049c.m83019a(TXCCommonUtil.getAppContext(), strSubstring, str);
                }
            } catch (Exception e2) {
                TXCLog.m82966e(TAG, "playAudioEffect error " + e2.toString());
            }
        }
        return str;
    }

    private String getEffectCachePath() {
        if (TXCCommonUtil.getAppContext() == null) {
            return "";
        }
        return TXCCommonUtil.getAppContext().getCacheDir() + File.separator + "liteav_effect";
    }

    public static TXCSoundEffectPlayer getInstance() {
        return C13977a.f57983a;
    }

    public void clearCache() {
        if (TXCCommonUtil.getAppContext() == null) {
            return;
        }
        try {
            File file = new File(getEffectCachePath());
            if (file.exists() && file.isDirectory() && C14049c.m83017a(file) > 52428800) {
                for (File file2 : file.listFiles()) {
                    file2.delete();
                }
            }
        } catch (Exception e) {
            TXCLog.m82973w(TAG, "clearCache error " + e.toString());
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i, int i2) {
        TXCLog.m82969i(TAG, "onMusicPlayFinish -> effect id = " + i);
        WeakReference<InterfaceC13982c> weakReference = mWeakSoundEffectListener;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        mWeakSoundEffectListener.get().onEffectPlayFinish(i);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i, long j, long j2) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i, int i2) {
        TXCLog.m82969i(TAG, "onStart -> effect id = " + i + ", errCode = " + i2);
        WeakReference<InterfaceC13982c> weakReference = mWeakSoundEffectListener;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        mWeakSoundEffectListener.get().onEffectPlayStart(i, i2);
    }

    public void pauseEffectWithId(int i) {
        TXCLog.m82969i(TAG, "pauseEffectWithId -> effect id = " + i);
        TXAudioEffectManagerImpl.getCacheInstance().pausePlayMusic(i);
    }

    public boolean playEffectWithId(int i, String str, boolean z, int i2) {
        TXCLog.m82969i(TAG, "playEffectWithId -> effect id = " + i + ", path = " + str + ", loop = " + i2);
        TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(i, checkIfAssetsFile(str));
        audioMusicParam.publish = z;
        audioMusicParam.loopCount = i2;
        audioMusicParam.isShortFile = true;
        boolean zStartPlayMusic = TXAudioEffectManagerImpl.getCacheInstance().startPlayMusic(audioMusicParam);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicObserver(i, this);
        this.mShortEffectorIDList.add(Integer.valueOf(i));
        TXCLog.m82969i(TAG, "playEffectWithId ->effect id = " + i + ", startPlayMusic result = " + zStartPlayMusic);
        return zStartPlayMusic;
    }

    public void resumeEffectWithId(int i) {
        TXCLog.m82969i(TAG, "resumeEffectWithId -> effect id = " + i);
        TXAudioEffectManagerImpl.getCacheInstance().resumePlayMusic(i);
    }

    public void setEffectsVolume(float f) {
        TXCLog.m82969i(TAG, "setEffectsVolume -> volume = " + f);
        Iterator<Integer> it = this.mShortEffectorIDList.iterator();
        while (it.hasNext()) {
            TXAudioEffectManagerImpl.getCacheInstance().setMusicVolume(it.next().intValue(), (int) (100.0f * f));
        }
    }

    public void setSoundEffectListener(InterfaceC13982c interfaceC13982c) {
        if (interfaceC13982c == null) {
            mWeakSoundEffectListener = null;
        } else {
            mWeakSoundEffectListener = new WeakReference<>(interfaceC13982c);
        }
    }

    public void setVolumeOfEffect(int i, float f) {
        TXCLog.m82969i(TAG, "setVolumeOfEffect -> effect id = " + i + ", volume = " + f);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicVolume(i, (int) (f * 100.0f));
    }

    public void stopAllEffect() {
        TXCLog.m82969i(TAG, "stopAllEffect -> start");
        Iterator<Integer> it = this.mShortEffectorIDList.iterator();
        while (it.hasNext()) {
            TXAudioEffectManagerImpl.getCacheInstance().stopPlayMusic(it.next().intValue());
        }
        this.mShortEffectorIDList.clear();
        TXCLog.m82969i(TAG, "stopAllEffect -> finish");
    }

    public void stopEffectWithId(int i) {
        TXCLog.m82969i(TAG, "stopEffectWithId -> effect id = " + i);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicObserver(i, null);
        TXAudioEffectManagerImpl.getCacheInstance().stopPlayMusic(i);
        int iIndexOf = this.mShortEffectorIDList.indexOf(Integer.valueOf(i));
        if (iIndexOf >= 0) {
            this.mShortEffectorIDList.remove(iIndexOf);
        }
    }
}
