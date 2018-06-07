package com.demo.recognition.face.retrofitdemo;

import java.io.Serializable;

/**
 * 返回数据的实体类
 */

public class RetrofitEntity implements Serializable{

    /**
     * status : 1
     * data : {"imgUrl":"","lowestTemp":" 22","maxTemp":"32 ","date":"2018-06-07","suggest":"不宜","airQuality":"103","weather":"雷阵雨转阴","wind":"东风微风","todayRule":"2和7","tomorrowRule":"3和8"}
     */

    private int status;
    private DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * imgUrl :
         * lowestTemp :  22
         * maxTemp : 32
         * date : 2018-06-07
         * suggest : 不宜
         * airQuality : 103
         * weather : 雷阵雨转阴
         * wind : 东风微风
         * todayRule : 2和7
         * tomorrowRule : 3和8
         */

        private String imgUrl;
        private String lowestTemp;
        private String maxTemp;
        private String date;
        private String suggest;
        private String airQuality;
        private String weather;
        private String wind;
        private String todayRule;
        private String tomorrowRule;

        public String getImgUrl() {
            return imgUrl;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public String getLowestTemp() {
            return lowestTemp;
        }

        public void setLowestTemp(String lowestTemp) {
            this.lowestTemp = lowestTemp;
        }

        public String getMaxTemp() {
            return maxTemp;
        }

        public void setMaxTemp(String maxTemp) {
            this.maxTemp = maxTemp;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getSuggest() {
            return suggest;
        }

        public void setSuggest(String suggest) {
            this.suggest = suggest;
        }

        public String getAirQuality() {
            return airQuality;
        }

        public void setAirQuality(String airQuality) {
            this.airQuality = airQuality;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public String getWind() {
            return wind;
        }

        public void setWind(String wind) {
            this.wind = wind;
        }

        public String getTodayRule() {
            return todayRule;
        }

        public void setTodayRule(String todayRule) {
            this.todayRule = todayRule;
        }

        public String getTomorrowRule() {
            return tomorrowRule;
        }

        public void setTomorrowRule(String tomorrowRule) {
            this.tomorrowRule = tomorrowRule;
        }
    }
}
