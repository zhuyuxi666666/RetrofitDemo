package com.demo.recognition.face.retrofitdemo.logs;

public interface Log {

    /**
     * Set whether to print the log into LogCat
     * @param logToLogCat - log to Log cat
     */
    void setLogToLogCat(boolean logToLogCat);

    /**
     *
     * @param tag
     * @param msg
     * @return
     */
    int d(String tag, Object msg);
    /**
     * Wrapper of {@link android.util.Log#d(String, String)}
     * @param tag
     * @param msg
     * @param params
     * @return
     */
    int d(String tag, String msg, Object... params);


    int i(String tag, Object msg);
    /**
     * Wrapper of {@link android.util.Log#i(String, String)}
     * @param tag
     * @param msg
     * @param params
     * @return
     */
    int i(String tag, String msg, Object... params);

    int v(String tag, Object msg);
    int v(String tag, String msg, Object... params);

    int w(String tag, Object msg);
    int w(String tag, String msg, Object... params);

    int e(String tag, Object msg);
    int e(String tag, String msg, Object... params);
    int e(String tag, String msg, Throwable e);
}
